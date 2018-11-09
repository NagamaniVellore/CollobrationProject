package com.niit.cde.Model;

import java.sql.Date;

public class Job {
	private int JobId;
	private String JobName;
	private String JobDesignation;
	private String JobDesc;
	private int Salary;
	private Date ExpiryDate;
	private int Experience;
	private String Skills;
	public int getJobId() {
		return JobId;
	}
	public void setJobId(int jobId) {
		JobId = jobId;
	}
	public String getJobName() {
		return JobName;
	}
	public void setJobName(String jobName) {
		JobName = jobName;
	}
	public String getJobDesignation() {
		return JobDesignation;
	}
	public void setJobDesignation(String jobDesignation) {
		JobDesignation = jobDesignation;
	}
	public String getJobDesc() {
		return JobDesc;
	}
	public void setJobDesc(String jobDesc) {
		JobDesc = jobDesc;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public Date getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		ExpiryDate = expiryDate;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	public String getSkills() {
		return Skills;
	}
	public void setSkills(String skills) {
		Skills = skills;
	}
	

}
