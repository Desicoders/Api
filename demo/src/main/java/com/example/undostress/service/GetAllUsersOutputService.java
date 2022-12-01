package com.example.undostress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.undostress.exceptions.NoOutputExp;
import com.example.undostress.pojo.OutputAllUsers;
import com.example.undostress.repository.GetAllOutputUsers;

@Service
public class GetAllUsersOutputService {
	@Autowired
	GetAllOutputUsers getAllOutputUsers;
	
	public List<OutputAllUsers> getAll(){
		return getAllOutputUsers.findAll();
	}
	public OutputAllUsers getById(int id){
		return getAllOutputUsers.findById(id).orElseThrow(()->new NoOutputExp("No output with id ="+id)) ;
	}

}
