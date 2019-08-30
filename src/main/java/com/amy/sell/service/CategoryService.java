package com.amy.sell.service;

import com.amy.sell.model.ProductCategory;

import java.util.List;

/**
 * 类目
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryTypeList);

    int save(ProductCategory productCategory);

}
