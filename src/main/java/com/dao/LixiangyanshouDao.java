package com.dao;

import com.entity.LixiangyanshouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LixiangyanshouView;

/**
 * 项目验收 Dao 接口
 *
 * @author 
 */
public interface LixiangyanshouDao extends BaseMapper<LixiangyanshouEntity> {

   List<LixiangyanshouView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
