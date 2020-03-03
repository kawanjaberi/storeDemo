package org.store.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.store.demo.model.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
