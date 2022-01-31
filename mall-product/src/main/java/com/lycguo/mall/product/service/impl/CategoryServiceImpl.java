package com.lycguo.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lycguo.common.utils.PageUtils;
import com.lycguo.common.utils.Query;
import com.lycguo.mall.product.dao.CategoryDao;
import com.lycguo.mall.product.entity.CategoryEntity;
import com.lycguo.mall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 1. 查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        // 2. 组装成父子的树形结构
        // 2.1 找出一级分类
        List<CategoryEntity> level1Menus = categoryEntities.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == 0;
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity, categoryEntities));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort())
                    - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return categoryEntities;
    }

    @Override
    public void deleteMenuByIds(List<Long> asList) {
        int result = baseMapper.deleteBatchIds(asList);
        log.info("result = {}", result);
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort())
                    - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}
