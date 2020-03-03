package org.store.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.store.demo.model.Product;
import org.store.demo.model.User;
import org.store.demo.repository.ProductRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/product")
@Api(value = "Product RESTful APIs")
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public void ProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @ApiOperation(value = "Create a Product")
    @PostMapping
    //@ResponseStatus(CREATED)
    public Product createProduct(@Valid @RequestBody Product product) {
        Product createdProduct = productRepository.save(product);
        return createdProduct;
    }
}
