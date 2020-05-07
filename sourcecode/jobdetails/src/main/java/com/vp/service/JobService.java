package com.vp.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vp.exception.JobNotFoundException;
import com.vp.model.Jobdetails;
import com.vp.repository.JobRepository;


@Service
@Transactional
public class JobService implements JobServiceInterface{
	@Autowired
	JobRepository jobRepository;
	public List<Jobdetails> getAllJobdetails(){
		return (List<Jobdetails>) jobRepository.findAll();
	}
 public void saveJob(Jobdetails jobdetails)
 {
	 jobRepository.save(jobdetails);
 }
 public boolean updatejobdetails(Jobdetails jobdetails) {
	 return jobRepository.save(jobdetails)!=null;
	}
 
	public void deletejob(Integer Jobid)throws JobNotFoundException {
		Jobdetails jd=jobRepository.findById(Jobid)
				.orElseThrow(()-> new JobNotFoundException());
	jobRepository.deleteById(Jobid);
	}
	
}
