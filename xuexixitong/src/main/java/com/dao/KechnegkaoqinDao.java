package com.dao;

import com.entity.KechnegkaoqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KechnegkaoqinView;

/**
 * 课程考勤 Dao 接口
 *
 * @author 
 */
public interface KechnegkaoqinDao extends BaseMapper<KechnegkaoqinEntity> {

   List<KechnegkaoqinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
