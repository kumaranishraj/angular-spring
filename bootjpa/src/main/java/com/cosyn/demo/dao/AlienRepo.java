package com.cosyn.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.cosyn.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{

}
