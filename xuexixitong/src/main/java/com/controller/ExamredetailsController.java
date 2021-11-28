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
 * 答题详情表
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/examredetails")
public class ExamredetailsController {
    private static final Logger logger = LoggerFactory.getLogger(ExamredetailsController.class);

    @Autowired
    private ExamredetailsService examredetailsService;


    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private ExamquestionService examquestionService;

    @Autowired
    private ExamrecordService examrecordService;
    @Autowired
    private ExamrewrongquestionService examrewrongquestionService;
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
        PageUtils page = examredetailsService.queryPage(params);

        //字典表数据转换
        List<ExamredetailsView> list =(List<ExamredetailsView>)page.getList();
        for(ExamredetailsView c:list){
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
        ExamredetailsEntity examredetails = examredetailsService.selectById(id);
        if(examredetails !=null){
            //entity转view
            ExamredetailsView view = new ExamredetailsView();
            BeanUtils.copyProperties( examredetails , view );//把实体数据重构到view中

                //级联表
                ExamquestionEntity examquestion = examquestionService.selectById(examredetails.getExamquestionId());
                if(examquestion != null){
                    BeanUtils.copyProperties( examquestion , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setExamquestionId(examquestion.getId());
                }
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
    public R save(@RequestBody ExamredetailsEntity examredetails,Integer examrecordId, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,examredetails:{}",this.getClass().getName(),examredetails.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }else if("学生".equals(role)){
            examredetails.setXueshengId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        }
        examredetails.setCreateTime(new Date());
        boolean insert = examredetailsService.insert(examredetails);
        if(!insert){
            return R.error();
        }
        ExamquestionEntity examquestion = examquestionService.selectById(examredetails.getExamquestionId());
        if(examquestion.getExamquestionAnswer().equals(examredetails.getExamredetailsMyanswer())){
            ExamrecordEntity examrecord = examrecordService.selectById(examrecordId);
            examrecord.setTotalScore(examrecord.getTotalScore()+examredetails.getExamredetailsMyscore());
            boolean b = examrecordService.updateById(examrecord);
            if(!b){
                return R.error();
            }
        }else{
            ExamrewrongquestionEntity examrewrongquestion = new ExamrewrongquestionEntity();
            examrewrongquestion.setCreateTime(new Date());
            examrewrongquestion.setInsertTime(new Date());
            examrewrongquestion.setXueshengId(examredetails.getXueshengId());
            examrewrongquestion.setExampaperId(examquestion.getExampaperId());
            examrewrongquestion.setExamquestionId(examquestion.getId());
            examrewrongquestion.setExamredetailsMyanswer(examredetails.getExamredetailsMyanswer());
            examrewrongquestionService.insert(examrewrongquestion);
        }


        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ExamredetailsEntity examredetails, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,examredetails:{}",this.getClass().getName(),examredetails.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        //根据字段查询是否有相同数据
        Wrapper<ExamredetailsEntity> queryWrapper = new EntityWrapper<ExamredetailsEntity>()
            .notIn("id",examredetails.getId())
            .andNew()
            .eq("examredetails_uuid_number", examredetails.getExamredetailsUuidNumber())
            .eq("xuesheng_id", examredetails.getXueshengId())
            .eq("examquestion_id", examredetails.getExamquestionId())
            .eq("examredetails_myanswer", examredetails.getExamredetailsMyanswer())
            .eq("examredetails_myscore", examredetails.getExamredetailsMyscore())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ExamredetailsEntity examredetailsEntity = examredetailsService.selectOne(queryWrapper);
        if(examredetailsEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      examredetails.set
            //  }
            examredetailsService.updateById(examredetails);//根据id更新
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
        examredetailsService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }




    /**
    * 前端列表
    */
    @IgnoreAuth    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("学生".equals(role))
            params.put("xueshengId",request.getSession().getAttribute("userId"));
        else if("教师".equals(role))
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = examredetailsService.queryPage(params);

        //字典表数据转换
        List<ExamredetailsView> list =(List<ExamredetailsView>)page.getList();
        for(ExamredetailsView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ExamredetailsEntity examredetails = examredetailsService.selectById(id);
            if(examredetails !=null){
                //entity转view
                ExamredetailsView view = new ExamredetailsView();
                BeanUtils.copyProperties( examredetails , view );//把实体数据重构到view中

                //级联表
                    ExamquestionEntity examquestion = examquestionService.selectById(examredetails.getExamquestionId());
                if(examquestion != null){
                    BeanUtils.copyProperties( examquestion , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setExamquestionId(examquestion.getId());
                }
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
    public R add(@RequestBody ExamredetailsEntity examredetails, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,examredetails:{}",this.getClass().getName(),examredetails.toString());
        Wrapper<ExamredetailsEntity> queryWrapper = new EntityWrapper<ExamredetailsEntity>()
            .eq("examredetails_uuid_number", examredetails.getExamredetailsUuidNumber())
            .eq("xuesheng_id", examredetails.getXueshengId())
            .eq("examquestion_id", examredetails.getExamquestionId())
            .eq("examredetails_myanswer", examredetails.getExamredetailsMyanswer())
            .eq("examredetails_myscore", examredetails.getExamredetailsMyscore())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ExamredetailsEntity examredetailsEntity = examredetailsService.selectOne(queryWrapper);
        if(examredetailsEntity==null){
            examredetails.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      examredetails.set
        //  }
        examredetailsService.insert(examredetails);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
     * 新增未保存
     */
    @RequestMapping("/addUnsaved")
    public R addUnsaved(@RequestParam Map<String, String> params, HttpServletRequest request){

        //记录查询出来的id数据
        String examredetailsList_id = ",";
        //记录需要新增的考题详情数据信息
        ArrayList<ExamredetailsEntity> examredetailsArrayList = new ArrayList<>();
        //记录需要新增的错题本数据信息
        ArrayList<ExamrewrongquestionEntity> examrewrongquestionArrayList = new ArrayList<>();
        //获得当前登录用户的id
        Integer xueshengId = (Integer) request.getSession().getAttribute("userId");
        //是否在新examredetailsArrayList中增加数据状态（默认为0，）为0时不添加 为1时添加
        Integer state = 0;

        //查询试题表获取到所有当前考卷的试题数据
        Wrapper<ExamquestionEntity> entityWrapper = new EntityWrapper<ExamquestionEntity>()
                .eq("exampaper_id",params.get("exampaperId"));
        List<ExamquestionEntity> examquestionList = examquestionService.selectList(entityWrapper);

        //根据uuid和用户id查询考题详情表中有无符合条件的数据
        Wrapper<ExamredetailsEntity> queryWrapper = new EntityWrapper<ExamredetailsEntity>()
                .eq("examredetails_uuid_number",params.get("examredetailsUuidNumber"))
                .eq("xuesheng_id",xueshengId);
        List<ExamredetailsEntity> examredetailsList = examredetailsService.selectList(queryWrapper);

        //循环查出来的所有试题数据
        for (ExamquestionEntity examquestion:examquestionList) {
            //判断查出的数据是否大于0
            if(examredetailsList.size()>0){//如果大于0记录数据中的id
                for (ExamredetailsEntity examredetails:examredetailsList) {
                    examredetailsList_id += examredetails.getExamquestionId()+",";
                }
                if(!examredetailsList_id.contains(String.valueOf(","+examquestion.getId()+","))){
                    state = 1;
                }else{
                    state = 0;
                }

            }else{
                state = 1;
            }
            if( state == 1){
                //考试详情表添加数据
                ExamredetailsEntity examredetailsEntity = new ExamredetailsEntity();
                examredetailsEntity.setExamredetailsMyscore(0);
                examredetailsEntity.setXueshengId(xueshengId);
                examredetailsEntity.setCreateTime(new Date());
                examredetailsEntity.setExamredetailsMyanswer("未作答");
                examredetailsEntity.setExamquestionId(examquestion.getId());
                examredetailsEntity.setExamredetailsUuidNumber(params.get("examredetailsUuidNumber"));
                examredetailsArrayList.add(examredetailsEntity);

                //错题表添加数据
                ExamrewrongquestionEntity examrewrongquestion = new ExamrewrongquestionEntity();
                examrewrongquestion.setCreateTime(new Date());
                examrewrongquestion.setInsertTime(new Date());
                examrewrongquestion.setXueshengId(xueshengId);
                examrewrongquestion.setExampaperId(Integer.parseInt(params.get("exampaperId")));
                examrewrongquestion.setExamquestionId(examquestion.getId());
                examrewrongquestion.setExamredetailsMyanswer("未作答");
                examrewrongquestionArrayList.add(examrewrongquestion);

                state = 0;
            }

        }
        boolean b = examredetailsService.insertBatch(examredetailsArrayList);
        if(!b){
            return R.error();
        }
        boolean b1 = examrewrongquestionService.insertBatch(examrewrongquestionArrayList);
        if(!b1){
            return R.error();
        }
        return R.ok();
    }




}

