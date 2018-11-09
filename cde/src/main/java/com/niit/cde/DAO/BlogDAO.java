package com.niit.cde.DAO;

import java.awt.List;

import com.niit.cde.Model.Blog;

public interface BlogDAO {
	public Boolean AddBlog(Blog blog);
	public Boolean DeleteBlog(Blog blog);
	public Boolean UpdateBlog(Blog blog);
	public List listBlog();
	public Blog getBlog(int BlogId);
    public boolean incrementDisLikes(int BlogId);
	public boolean approveBlog(Blog blog);
	public boolean incrementLikes( Blog blog);

	
	

}
