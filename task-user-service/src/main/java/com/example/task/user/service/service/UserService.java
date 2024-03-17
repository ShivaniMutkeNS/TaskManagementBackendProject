package com.example.task.user.service.service;

import com.example.task.user.service.exception.UserException;
import com.example.task.user.service.model.User;

import java.util.List;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;
	
	public User findUserById(Long userId) throws UserException;

	public List<User> findAllUsers();

//	public List<User> getPenddingRestaurantOwner();

//	void updatePassword(User user, String newPassword);

//	void sendPasswordResetEmail(User user);
}
