package com.lycguo.mall.product;

import com.lycguo.mall.product.entity.BrandEntity;
import com.lycguo.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ProductApplicationTest {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("hello");
        brandEntity.setName("苹果");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }
}