package io.gateway.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.gateway.userservice.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByname(String name);
}
