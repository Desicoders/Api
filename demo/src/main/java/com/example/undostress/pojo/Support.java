package com.example.undostress.pojo;

import java.security.Timestamp;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Support {
	        String url= "https://reqres.in/#support-heading";
	       String text ="To keep ReqRes free, contributions towards server costs are appreciated!";
	
}
