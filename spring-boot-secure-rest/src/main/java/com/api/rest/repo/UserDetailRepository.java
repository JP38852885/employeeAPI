package com.api.rest.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rest.entity.User;

/**
 *
 * @author Naga
 * @since 03 02 22
 */

public interface UserDetailRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String name);

	boolean existsByUsername(String name);

}
