package com.springrest.springrest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.UserDao;
import com.springrest.springrest.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public UserServiceImpl() {

	}

	@Override
	public Iterable<User> getUsers() {

		return userDao.findAll();
	}

	@Override
	public User getUser(long Number) {

		return userDao.getOne(Number);
	}

	@Override
	public User addUser(User user) {

		userDao.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {

		userDao.save(user);
		return user;
	}

	@Override
	public void deleteUser(long parseLong) {

		User entity = userDao.getOne(parseLong);
		userDao.delete(entity);
	}

}
