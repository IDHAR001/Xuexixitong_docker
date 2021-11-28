package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoqinqingjiaEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 考勤请假 服务类
 */
public interface KaoqinqingjiaService extends IService<KaoqinqingjiaEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}