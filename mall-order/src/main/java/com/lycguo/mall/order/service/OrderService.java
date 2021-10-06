package com.lycguo.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lycguo.common.utils.PageUtils;
import com.lycguo.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lycguo
 * @email 234917515@qq.com
 * @date 2021-10-06 21:49:05
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

