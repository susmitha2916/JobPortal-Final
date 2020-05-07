package com.vp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vp.model.Jobdetails;
import com.vp.service.JobServiceInterface;

@RestController
public class JobController {
	@Autowired
	JobServiceInterface jobServiceInterface;
	
	
	@GetMapping("/jobs") 
	public List<Jobdetails> getJobdetails(){
		return jobServiceInterface.getAllJobdetails();
	}
	
	
	@PostMapping("/addjobs")
	public void insertJobdetails(@Valid @RequestBody Jobdetails jobdetails) {
		jobServiceInterface.saveJob(jobdetails);
	}
	
	@RequestMapping(value = "/addjobs", method = RequestMethod.PUT)
	public HttpStatus updateJobdetails(@RequestBody Jobdetails jobdetails) {
		return jobServiceInterface.updatejobdetails(jobdetails)  ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;

}
	@RequestMapping(value = "/addjobs/{Jobid}", method = RequestMethod.DELETE)
	public HttpStatus deleteJob(@PathVariable Integer Jobid) {
		jobServiceInterface.deletejob(Jobid);
		return HttpStatus.NO_CONTENT;
	}
}	

