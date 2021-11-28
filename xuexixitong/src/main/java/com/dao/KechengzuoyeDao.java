package com.dao;

import com.entity.KechengzuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengzuoyeView;

/**
 * 课程作业 Dao 接口
 *
 * @author 
 */
public interface KechengzuoyeDao extends BaseMapper<KechengzuoyeEntity> {

   List<KechengzuoyeView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
