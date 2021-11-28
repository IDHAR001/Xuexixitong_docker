package com.dao;

import com.entity.XuexiziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiziliaoView;

/**
 * 学习资料 Dao 接口
 *
 * @author 
 */
public interface XuexiziliaoDao extends BaseMapper<XuexiziliaoEntity> {

   List<XuexiziliaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
