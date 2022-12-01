package com.example.undostress.pojo;

import java.security.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@OneToOne
	@JsonIgnore
	String EmailAndPswd;
	String job;
	String firstName;
	String lastName;
	
	@CreationTimestamp
	Timestamp createdAt;
	
	@UpdateTimestamp
	Timestamp updatedAt;
	
	
}
