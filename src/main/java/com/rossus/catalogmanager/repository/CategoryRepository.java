package com.rossus.catalogmanager.repository;

import com.rossus.catalogmanager.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findAllByName(String name);

}
