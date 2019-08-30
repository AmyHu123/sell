package com.amy.sell.service.impl;

import com.amy.sell.model.ProductCategory;
import com.amy.sell.utils.GsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

//    @Test
//    public void findOne() throws Exception {
//        ProductCategory productCategory = categoryService.findOne(1);
//        log.info("类目为:" + GsonUtil.toJson(productCategory));
//        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());
//    }
//
//    @Test
//    public void findByCategoryTypeIn() throws Exception {
//        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(Arrays.asList(10,20));
//        log.info("类目为:" + GsonUtil.toJson(productCategoryList));
//
//        Assert.assertNotEquals(0, productCategoryList.size());
//    }

}