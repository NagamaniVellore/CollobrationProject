package com.niit.cde.DAOImpl;

import java.awt.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.cde.DAO.BlogDAO;
import com.niit.cde.Model.Blog;
@Repository("BlogDAO")
@Transactional

public  class BlogDAOImpl implements BlogDAO {
	@Autowired
	SessionFactory sessionFactory;
	
   public Boolean AddBlog(Blog blog) {
		
	try
	{
		sessionFactory.getCurrentSession().save(blog);
		return true;
		}
	catch(Exception e)
	{
		return false;
	}
}
	
	

	public Boolean DeleteBlog(Blog blog) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(blog);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
	}

	public Boolean UpdateBlog(Blog blog) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(blog);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
		
	}

	public List listBlog() {
		// TODO Auto-generated method stub
		return null;
	}

	public Blog getBlog(int BlogId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Blog blog=session.get(Blog.class,BlogId);
		session.close();
		return blog;
	}

	public boolean incrementDisLikes(int BlogId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean approveBlog(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean incrementLikes(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean DeleteBlog() 
	{
		// TODO Auto-generated method stub
		return false;
	}

}