package org.store.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.store.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
