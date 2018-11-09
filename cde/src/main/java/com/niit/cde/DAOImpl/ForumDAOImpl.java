package com.niit.cde.DAOImpl;

import java.awt.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.cde.DAO.ForumDAO;
import com.niit.cde.Model.Forum;
@Repository("ForumDAO")
@Transactional
public class ForumDAOImpl implements ForumDAO {
	@Autowired
	SessionFactory sessionFactory;
	public Boolean AddForum(Forum forum) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().save(forum);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
	}
		
	

	public Boolean DeleteForum(Forum forum) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(forum);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
	}
		
	

	public Boolean UpdateForum(Forum forum) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(forum);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
	}
		
	

	public List listForums() {
		// TODO Auto-generated method stub
		return null;
	}

	public Forum getForum(int ForumId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean incrementDisLikes(int ForumId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean approveForum(Forum forum) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean incrementLikes(Forum forum) {
		// TODO Auto-generated method stub
		return false;
	}

}
