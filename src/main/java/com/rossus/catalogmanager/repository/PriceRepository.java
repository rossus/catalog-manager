package com.rossus.catalogmanager.repository;

import com.rossus.catalogmanager.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
}
