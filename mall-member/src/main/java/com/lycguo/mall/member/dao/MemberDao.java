package com.lycguo.mall.member.dao;

import com.lycguo.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lycguo
 * @email 234917515@qq.com
 * @date 2021-10-06 21:43:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
