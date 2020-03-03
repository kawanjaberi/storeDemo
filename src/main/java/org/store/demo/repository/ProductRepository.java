package org.store.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.store.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
