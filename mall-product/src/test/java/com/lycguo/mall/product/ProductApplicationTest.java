package com.lycguo.mall.product;

import com.lycguo.mall.product.entity.BrandEntity;
import com.lycguo.mall.product.service.BrandService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ProductApplicationTest {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("hello");
        brandEntity.setName("苹果");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }
}
