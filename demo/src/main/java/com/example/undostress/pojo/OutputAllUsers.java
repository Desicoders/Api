package com.example.undostress.pojo;

import java.security.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.undostress.service.UserService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class OutputAllUsers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int page;
	int perPage=6;
	
	@Autowired
	UserService userService;


	int total=this.data.size();
	int totalPages=total/perPage;
	
	List<User> data=userService.getAllUsers();
	
	@Autowired
	Support support;
}
