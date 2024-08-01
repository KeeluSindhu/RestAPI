package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.restapiclass;
import com.example.demo.services.restapiclassservice;

@RestController  // step 5 postman connection

@RequestMapping("/api/v1")   // step 6
@CrossOrigin("http://localhost:4200")      //connect front end and back end
public class restapiclasscontroller {

	
	@Autowired  // step 1
	restapiclassservice service;  //step 2

	@PostMapping("/adding")    // step 4 
	
	public restapiclass insertion(@RequestBody restapiclass reg) {  //step 3   //step 7 request body
		
		return service.insertion(reg);
	}
	
	@PostMapping("/multiadd")     //step8
	
	public Iterable<restapiclass> multiinsertion(@RequestBody List<restapiclass> reg) {      //step8
		
		return service.multiinsertion(reg);
		
	}
	
	@GetMapping("/multifetch")     //step10 importing Getmapping to fetch
	
	public List<restapiclass> multifetch(){             //step 9 fetching
		
		return service.multifetch();
	}
	 @GetMapping("/idfetch/{id}")                      //step12 fetch by id
	public Optional<restapiclass> idfetch(@PathVariable int id) {        //step11 fetch by id
		
		return service.idfetch(id);
	}
	
	@DeleteMapping("/deleting/{id}")   //deleteing
	
	public String deleteid(@PathVariable int id) {
		
		return service.delete(id);
	
	}
	
@GetMapping("/getbyemail/{email}")
public restapiclass getbyemail(@PathVariable String email) {
	return service.getbyemail(email);
}
@PutMapping("/update")
public restapiclass update( @RequestBody  restapiclass reg) {
	return service.update(reg);
}
}