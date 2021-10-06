package com.lycguo.mall.product.dao;

import com.lycguo.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lycguo
 * @email 234917515@qq.com
 * @date 2021-10-06 20:10:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
