package com.dao;

import com.entity.ButieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ButieView;

/**
 * 离职退休费用 Dao 接口
 *
 * @author 
 * @since 2021-03-06
 */
public interface ButieDao extends BaseMapper<ButieEntity> {

   List<ButieView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
