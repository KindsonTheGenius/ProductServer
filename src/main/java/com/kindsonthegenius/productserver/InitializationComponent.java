package com.kindsonthegenius.productserver;

import com.kindsonthegenius.productserver.models.Product;
import com.kindsonthegenius.productserver.models.ProductCategory;
import com.kindsonthegenius.productserver.repositories.ProductCategoryRepository;
import com.kindsonthegenius.productserver.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitializationComponent {

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    private void init(){

        productRepository.deleteAll();

        Product product=new Product();
        product.setName("Kamsung D3");
        product.setCode("KAMSUNG-TRIOS");
        product.setTitle("Kamsung Trios 12 inch ");
        product.setDescription("Kamsung Trios 12 Touch");
        product.setLocation("USA");
        product.setPrice(12000.00);
        productRepository.save(product);

        product=new Product();
        product.setName("Lokia Pomia");
        product.setCode("LOKIA-POMIA");
        product.setTitle("Lokia 12 inch" );
        product.setDescription("Lokia Pomia 10");
        product.setLocation("USA");
        product.setPrice(9000.00);
        productRepository.save(product);

        product=new Product();
        product.setName("Huawei Spyphone");
        product.setCode("HUAWEI SP");
        product.setTitle("Lokia 12 inch" );
        product.setDescription("Lokia Pomia 10");
        product.setLocation("USA");
        product.setPrice(11200.00);
        productRepository.save(product);

        product=new Product();
        product.setName("Galaxy s4");
        product.setCode("Galaxy s4");
        product.setTitle("Galaxy s4 12 inch" );
        product.setDescription("Galaxy s4 Pomia 10");
        product.setLocation("USA");
        product.setPrice(8800.00);
        productRepository.save(product);
    }
}
