package com.kindsonthegenius.productserver.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ProductCategory {

    @Id
    private String id;
    private String name;
    private String title;
    private String description;
    private String imgUrl;

    public ProductCategory(){

    }
}
