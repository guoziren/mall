package com.lycguo.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lycguo.common.utils.PageUtils;
import com.lycguo.mall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author lycguo
 * @email 234917515@qq.com
 * @date 2021-10-06 21:43:35
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

