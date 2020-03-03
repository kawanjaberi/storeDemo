package org.store.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.store.demo.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
