package io.gateway.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.gateway.userservice.domain.Role;
import io.gateway.userservice.domain.User;
import io.gateway.userservice.repository.RoleRepository;
import io.gateway.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;




@Service
@Transactional
@Slf4j

public class UserServiceImplementation implements UserService
{

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleRepository roleRepo;

	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public Role saveRole(Role role) {
	
		return roleRepo.save(role);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		User user = userRepo.findByUsername(username);
		Role role = roleRepo.findByname(roleName);
		user.getRoles().add(role);
		
	}

	@Override
	public User getUser(String username) {
		return userRepo.findByUsername(username);
	}

	@Override
	public List<User> getUsers() {
		return userRepo.findAll();
	}


}
