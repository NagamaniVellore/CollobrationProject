package com.niit.cde.DAOImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.cde.DAO.BlogCommentDAO;
import com.niit.cde.Model.Blog;
import com.niit.cde.Model.BlogComment;

public class BlogCommentDAOImpl implements BlogCommentDAO {
	@Autowired
	SessionFactory sessionFactory;

	public Boolean AddBlogComment(BlogComment blogcomment) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().save(blogcomment);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
	}
		
		
	

	public Boolean DeleteBlogComment(BlogComment blogcomment) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(blogcomment);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
	}
		
	

	public Boolean UpdateBlogComment(BlogComment blogcomment) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(blogcomment);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
	}
		
	

	public Blog getBlog(int BlogId) {
		// TODO Auto-generated method stub
		return null;
	}

}
