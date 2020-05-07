package com.vp.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


@Entity
@Data
@NonNull
@Getter
@Setter
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Userid;
	@NotBlank(message=" enter a username ")
	String Username;
	@NotEmpty(message="password cannot be empty")
	@Min(value=6 ,message= "password should be morethan 6 characters")
	@Max(value=10,message ="password should not ecxeed morethan 10 characters")
	String Password;
	@javax.validation.constraints.Email(message="email should format should be abc@gmail.com")
	String Email;
	String Usertype;
	
}
