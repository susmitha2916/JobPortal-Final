package com.vp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vp.exception.JobsRecordNotFoundException;
import com.vp.model.Jobdetails;
import com.vp.service.IJobSearchService;

@RestController
public class JobSearchController {

	@Autowired
	IJobSearchService iJobSearchService;
	
	@GetMapping("getallsortedjobs/{sortedParam}")
	public List<Jobdetails> getAllSortedJobs(@PathVariable String sortedParam){
		 return iJobSearchService.findSortedJobs(sortedParam);
		
	}

	@GetMapping("getalljobsbyjobskills/{jobskills}")
	public List<Jobdetails> getJobsByJobskills(@PathVariable String jobskills){
		 List<Jobdetails> jobDetails= iJobSearchService.getJobsByJobskills(jobskills);
		 if(jobDetails.isEmpty()) {
			  throw new JobsRecordNotFoundException();
		  }
		  return jobDetails;
			
		
	}
	
	@GetMapping("getalljobsbyjobname/{jobname}")
	public List<Jobdetails> getJobsByJobname(@PathVariable String jobname){
		// return iJobSearchService.getJobsByJobname(jobname);
		List<Jobdetails> jobDetails=	iJobSearchService.getJobsByJobname(jobname);
		  if(jobDetails.isEmpty()) {
			  throw new JobsRecordNotFoundException();
		  }
		  return jobDetails;
		
	}
	
	@GetMapping("getalljobsbycompanyname/{companyname}")
	public List<Jobdetails> getJobsByCompanyname(@PathVariable String companyname){
		// return iJobSearchService.getJobsByCompanyname(companyname);*/
		List<Jobdetails> jobDetails=	iJobSearchService.getJobsByCompanyname(companyname);
		  if(jobDetails.isEmpty()) {
			  throw new JobsRecordNotFoundException();
		  }
		  return jobDetails;
		
		
	}
	@GetMapping("getalljobsbysalary/{salary}")
	public List<Jobdetails> getJobsBySalary(@PathVariable String salary){
		// return iJobSearchService.getJobsBySalary(salary);
		List<Jobdetails> jobDetails=	iJobSearchService.getJobsBySalary(salary);
		  if(jobDetails.isEmpty()) {
			  throw new JobsRecordNotFoundException();
		  }
		  return jobDetails;
		
	}
	
	
	}


