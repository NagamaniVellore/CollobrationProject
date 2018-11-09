package com.niit.cde.DAO;

import java.awt.List;

import com.niit.cde.Model.Forum;

public interface ForumDAO {
	public Boolean AddForum(Forum forum);
	public Boolean DeleteForum(Forum forum);
	public Boolean UpdateForum(Forum forum);
	public List listForums();
	public Forum getForum(int ForumId);
    public boolean incrementDisLikes(int ForumId);
	public boolean approveForum(Forum forum);
	public boolean incrementLikes(Forum forum );
	

}
