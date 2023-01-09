package io.gateway.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.gateway.userservice.domain.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{
	User findByUsername(String username);
	
}
