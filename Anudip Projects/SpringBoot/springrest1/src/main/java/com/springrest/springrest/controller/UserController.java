package com.springrest.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.User;
import com.springrest.springrest.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

//fetching users 
	@GetMapping("/Users")
	public Iterable<User> getUsers() {
		return this.userService.getUsers();
	}

//fetching user by their phone number
	@GetMapping("/Users/{Number}")
	public User getUser(@PathVariable String Number) {
		return this.userService.getUser(Long.parseLong(Number));
	}

// adding user in list
	@PostMapping("/Users")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);

	}

// updating users information
	@PutMapping("/Users/{Number}")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
	}

// delete user from list
	@DeleteMapping("/Users/{Number}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String Number) {
		try {
			this.userService.deleteUser(Long.parseLong(Number));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
