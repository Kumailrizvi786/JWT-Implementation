package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.dao.UserDao;
import com.javainuse.model.DAOUser;
import com.javainuse.model.UserDTO;

@RestController
public class HelloWorldController {
	
	@Autowired
	private UserDao userDao;

	@RequestMapping( value = "/hello", method = RequestMethod.GET)
	public String firstPage(@RequestParam long id) {
		DAOUser obj = new DAOUser();
		obj = userDao.findById(id).get();
		return "Hello "+ obj.getUsername();
	}

}