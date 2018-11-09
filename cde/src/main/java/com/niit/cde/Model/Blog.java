package com.niit.cde.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class Blog {

	@Id
	private int id;
	private String Name;
	private String Desc;
	private Date CreateDate;
	private String UserName;
	private String Status;
	private int Like;
	private int Dislike;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getLike() {
		return Like;
	}
	public void setLike(int like) {
		Like = like;
	}
	public int getDislike() {
		return Dislike;
	}
	public void setDislike(int dislike) {
		Dislike = dislike;
	}
	
	
	

}
