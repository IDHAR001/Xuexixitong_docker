package com.controller;


















import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 学习视频
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xuexishipin")
public class XuexishipinController {
    private static final Logger logger = LoggerFactory.getLogger(XuexishipinController.class);

    @Autowired
    private XuexishipinService xuexishipinService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private XueshengService xueshengService;
    @Autowired
    private JiaoshiService jiaoshiService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("学生".equals(role))
            params.put("xueshengId",request.getSession().getAttribute("userId"));
        else if("教师".equals(role))
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = xuexishipinService.queryPage(params);

        //字典表数据转换
        List<XuexishipinView> list =(List<XuexishipinView>)page.getList();
        for(XuexishipinView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XuexishipinEntity xuexishipin = xuexishipinService.selectById(id);
        if(xuexishipin !=null){
            //entity转view
            XuexishipinView view = new XuexishipinView();
            BeanUtils.copyProperties( xuexishipin , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody XuexishipinEntity xuexishipin, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xuexishipin:{}",this.getClass().getName(),xuexishipin.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        Wrapper<XuexishipinEntity> queryWrapper = new EntityWrapper<XuexishipinEntity>()
            .eq("xuexishipin_name", xuexishipin.getXuexishipinName())
            .eq("kecheng_types", xuexishipin.getKechengTypes())
            .eq("xuexishipin_video", xuexishipin.getXuexishipinVideo())
            .eq("xuexishipin_text", xuexishipin.getXuexishipinText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XuexishipinEntity xuexishipinEntity = xuexishipinService.selectOne(queryWrapper);
        if(xuexishipinEntity==null){
            xuexishipin.setCreateTime(new Date());
            xuexishipinService.insert(xuexishipin);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XuexishipinEntity xuexishipin, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,xuexishipin:{}",this.getClass().getName(),xuexishipin.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        //根据字段查询是否有相同数据
        Wrapper<XuexishipinEntity> queryWrapper = new EntityWrapper<XuexishipinEntity>()
            .notIn("id",xuexishipin.getId())
            .andNew()
            .eq("xuexishipin_name", xuexishipin.getXuexishipinName())
            .eq("kecheng_types", xuexishipin.getKechengTypes())
            .eq("xuexishipin_video", xuexishipin.getXuexishipinVideo())
            .eq("xuexishipin_text", xuexishipin.getXuexishipinText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XuexishipinEntity xuexishipinEntity = xuexishipinService.selectOne(queryWrapper);
        if("".equals(xuexishipin.getXuexishipinPhoto()) || "null".equals(xuexishipin.getXuexishipinPhoto())){
                xuexishipin.setXuexishipinPhoto(null);
        }
        if("".equals(xuexishipin.getXuexishipinVideo()) || "null".equals(xuexishipin.getXuexishipinVideo())){
                xuexishipin.setXuexishipinVideo(null);
        }
        if(xuexishipinEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      xuexishipin.set
            //  }
            xuexishipinService.updateById(xuexishipin);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        xuexishipinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }




    /**
    * 前端列表
    */
    @IgnoreAuth    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = xuexishipinService.queryPage(params);

        //字典表数据转换
        List<XuexishipinView> list =(List<XuexishipinView>)page.getList();
        for(XuexishipinView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XuexishipinEntity xuexishipin = xuexishipinService.selectById(id);
            if(xuexishipin !=null){
                //entity转view
                XuexishipinView view = new XuexishipinView();
                BeanUtils.copyProperties( xuexishipin , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody XuexishipinEntity xuexishipin, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,xuexishipin:{}",this.getClass().getName(),xuexishipin.toString());
        Wrapper<XuexishipinEntity> queryWrapper = new EntityWrapper<XuexishipinEntity>()
            .eq("xuexishipin_name", xuexishipin.getXuexishipinName())
            .eq("kecheng_types", xuexishipin.getKechengTypes())
            .eq("xuexishipin_video", xuexishipin.getXuexishipinVideo())
            .eq("xuexishipin_text", xuexishipin.getXuexishipinText())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XuexishipinEntity xuexishipinEntity = xuexishipinService.selectOne(queryWrapper);
        if(xuexishipinEntity==null){
            xuexishipin.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      xuexishipin.set
        //  }
        xuexishipinService.insert(xuexishipin);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }




}

