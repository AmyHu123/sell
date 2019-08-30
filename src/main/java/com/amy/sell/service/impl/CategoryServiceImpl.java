package com.amy.sell.service.impl;

import com.amy.sell.mapper.ProductCategoryMapper;
import com.amy.sell.model.ProductCategory;
import com.amy.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 类目
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;


    @Override
    public ProductCategory findOne(Integer categoryId) {
        return productCategoryMapper.selectByPrimaryKey(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryMapper.selectAll();
    }

    @Override
    public ProductCategory findByCategoryType(Integer categoryTypeList) {
        Example example = new Example(ProductCategory.class);
        example.createCriteria().andEqualTo("categoryType",categoryTypeList);
        return productCategoryMapper.selectOneByExample(example);
    }

    @Override
    public int save(ProductCategory productCategory) {
        return productCategoryMapper.insert(productCategory);
    }
}
