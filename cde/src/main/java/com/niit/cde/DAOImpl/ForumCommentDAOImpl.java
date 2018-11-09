package com.niit.cde.DAOImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.cde.DAO.ForumCommentDAO;
import com.niit.cde.Model.ForumComment;

public class ForumCommentDAOImpl implements ForumCommentDAO {
	@Autowired
	SessionFactory sessionFactory;
	public Boolean AddForumComment(ForumComment forumcomment) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().save(forumcomment);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
	}
		
	

	public Boolean DeleteForumComment(ForumComment forumcomment) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(forumcomment);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
	}
		
	

	public Boolean UpdateForumComment(ForumComment forumcomment) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(forumcomment);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
	}
		
	

	public ForumComment getBlog(int CommentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
