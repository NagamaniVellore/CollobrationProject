package com.niit.cde.DAO;

import com.niit.cde.Model.JobApplied;
import com.niit.cde.Model.Blog;


public interface JobAppliedDAO {
	public Boolean AddJobApplied(JobApplied jobapplied);
	public Boolean DeleteJobApplied(JobApplied jobapplied);
	public Boolean UpdateJobApplied(JobApplied jobapplied);
	public JobApplied getJobApplied(int JobId);

}
