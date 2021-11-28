package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.KaoqinqingjiaDao;
import com.entity.KaoqinqingjiaEntity;
import com.service.KaoqinqingjiaService;
import com.entity.view.KaoqinqingjiaView;

/**
 * 考勤请假 服务实现类
 */
@Service("kaoqinqingjiaService")
@Transactional
public class KaoqinqingjiaServiceImpl extends ServiceImpl<KaoqinqingjiaDao, KaoqinqingjiaEntity> implements KaoqinqingjiaService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<KaoqinqingjiaView> page =new Query<KaoqinqingjiaView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
