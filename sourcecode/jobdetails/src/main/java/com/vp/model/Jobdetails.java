package com.vp.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Entity
@NonNull
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name="jobdetails")
public class Jobdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Jobid;
	@NotBlank(message="add a jobname")
	private String jobname;
	@NotEmpty(message="jobskills cannot be empty")
	private String jobskills;
	private String companyname;
	private String salary;
	
	
}

