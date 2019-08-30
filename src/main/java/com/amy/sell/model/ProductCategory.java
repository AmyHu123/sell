package com.amy.sell.model;

import lombok.Data;

import javax.persistence.Table;
import java.util.Date;

/**
 * 类目
 */
@Table(name = "product_category")
@Data
public class ProductCategory {

    /** 类目id. */
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
