package org.store.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.store.demo.model.Foods;

public interface FoodRepository extends JpaRepository<Foods, Long> {
}
