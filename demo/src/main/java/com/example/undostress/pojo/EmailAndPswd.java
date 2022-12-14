package com.example.undostress.pojo;

import java.util.List;

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
public class EmailAndPswd {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String email;
	String password;

}
