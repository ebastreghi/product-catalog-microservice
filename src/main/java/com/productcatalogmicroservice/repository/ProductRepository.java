package com.productcatalogmicroservice.repository;

import com.productcatalogmicroservice.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
