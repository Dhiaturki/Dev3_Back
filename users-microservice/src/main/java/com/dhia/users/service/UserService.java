package com.dhia.users.service;

import com.dhia.users.entities.Role;
import com.dhia.users.entities.User;
import com.dhia.users.service.register.RegistrationRequest;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	
	User registerUser(RegistrationRequest request);
	
	public void sendEmailUser(User u, String code);
	public User validateToken(String code);


}
