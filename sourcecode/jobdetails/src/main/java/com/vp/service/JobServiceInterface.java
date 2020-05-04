package com.vp.service;
import java.util.List;

import com.vp.model.Jobdetails;

public interface JobServiceInterface {

	public List<Jobdetails> getAllJobdetails();
	public void saveJob(Jobdetails jobdetails);
	public boolean updatejobdetails(Jobdetails jobdetails);
	public void deletejob(Integer Jobid);

}

