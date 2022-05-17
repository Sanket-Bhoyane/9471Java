package com.springrest.springrest.dao;

import org.springframework.data.repository.CrudRepository;

import com.springrest.springrest.entity.User;

public interface UserDao extends CrudRepository<User, Long> {

	User getOne(long number);

}
