package com.rossus.catalogmanager.repository;

import com.rossus.catalogmanager.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
