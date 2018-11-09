package com.niit.cde.Model;

import java.sql.Date;

public class BlogComment {
	private int CommentId;
	private int BlodId;
	private String CommentText;
	private String LoginName;
	private Date CommentDate;
	public int getCommentId() {
		return CommentId;
	}
	public void setCommentId(int commentId) {
		CommentId = commentId;
	}
	public int getBlodId() {
		return BlodId;
	}
	public void setBlodId(int blodId) {
		BlodId = blodId;
	}
	public String getCommentText() {
		return CommentText;
	}
	public void setCommentText(String commentText) {
		CommentText = commentText;
	}
	public String getLoginName() {
		return LoginName;
	}
	public void setLoginName(String loginName) {
		LoginName = loginName;
	}
	public Date getCommentDate() {
		return CommentDate;
	}
	public void setCommentDate(Date commentDate) {
		CommentDate = commentDate;
	}

}
