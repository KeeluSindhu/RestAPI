package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.restapiclass;

@Repository
public interface restapiclassrepository extends CrudRepository<restapiclass, Integer >{

	restapiclass findByEmail(String email);

	

	
}
