package org.store.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.store.demo.model.Electronic;

public interface ElectronicRepository extends JpaRepository<Electronic, Long> {
}
