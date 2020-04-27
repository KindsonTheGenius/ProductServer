package com.kindsonthegenius.productserver.repositories;

import com.kindsonthegenius.productserver.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "productdata",
        path = "productdata")
public interface ProductRepository
        extends MongoRepository<Product, String> {
}
