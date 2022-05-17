package com.springrest.springrest.services;

import com.springrest.springrest.entity.User;

public interface UserService {

	public Iterable<User> getUsers();

	public User getUser(long Number);

	public User addUser(User user);

	public User updateUser(User user);

	public void deleteUser(long parseLong);
}
