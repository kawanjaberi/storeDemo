package org.store.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.store.demo.model.Clothes;

public interface ClothesRepository extends JpaRepository<Clothes, Long> {
}
