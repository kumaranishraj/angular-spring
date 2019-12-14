package com.cosyn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosyn.demo.dao.AlienRepo;
import com.cosyn.demo.model.Alien;

@RestController
public class AlienController {
	
	@Autowired	
	AlienRepo repo;
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@PostMapping("/alien")
	public Alien addAlien(Alien alien) {
		repo.save(alien);
		return alien;
	}
	
}
	