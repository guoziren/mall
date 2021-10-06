package com.lycguo.mall.order.dao;

import com.lycguo.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lycguo
 * @email 234917515@qq.com
 * @date 2021-10-06 21:49:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
