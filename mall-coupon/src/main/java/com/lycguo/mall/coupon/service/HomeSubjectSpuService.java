package com.lycguo.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lycguo.common.utils.PageUtils;
import com.lycguo.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author lycguo
 * @email 234917515@qq.com
 * @date 2021-10-06 21:38:17
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

