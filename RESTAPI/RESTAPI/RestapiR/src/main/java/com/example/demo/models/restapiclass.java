package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter  //step 2 constructors,setters,getters
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity    //step3 create table with the help of herbernet
public class restapiclass {





	
    @Id   //step4 to create columns
    @GeneratedValue(strategy = GenerationType.AUTO)//step5 to auto increment id
	private int id;  //creating columns step 1
 
	private String name; 
   	// step6 providing size

	
	private String location;  
	private String email;


}
