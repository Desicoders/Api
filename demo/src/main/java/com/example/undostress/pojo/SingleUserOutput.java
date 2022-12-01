package com.example.undostress.pojo;

import java.security.Timestamp;

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
public class SingleUserOutput {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	int id;
	@OneToOne
	User data;
	@OneToOne
	Support support;
	
	public SingleUserOutput(User data,Support support) {
		this.data=data;
		this.support=support;
	}
}
