package io.gateway.userservice.service;

import java.util.List;

import io.gateway.userservice.domain.Role;
import io.gateway.userservice.domain.User;

public interface UserService {
	User saveUser (User user);
	Role saveRole (Role role);
	void addRoleToUser(String username, String roleName);
	User getUser(String username);
	List<User> getUsers();
	
}
