package com.example.undostress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.undostress.exceptions.UserNotFoundException;
import com.example.undostress.pojo.EmailAndPswd;
import com.example.undostress.pojo.User;
import com.example.undostress.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public User saveUser(User u) {
		userRepo.save(u);
		return u;
	}
	public User get(Integer id) {
		return userRepo.findById(id).orElseThrow(()->new UserNotFoundException("NO user with id ="+id));

	}
	
	public User delete(User u) {
		userRepo.delete(u);
		return u;
	}
	public List<User> getAllUsers(int page){
		
		Pageable pageable=PageRequest.of(page,6);
		return (List<User>)userRepo.findAll(pageable);
	}
	public User Update(User u) {
		userRepo.saveAndFlush(u);
		return u;
	} 
	public List<User> getAllUsers(){
		return (List<User>)userRepo.findAll();
	}
	public User getUserByEAndP(EmailAndPswd EAndP)
	{
		return userRepo.findByEmailAndPswd(EAndP);
	}

}
