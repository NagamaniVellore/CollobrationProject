package com.niit.cde.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.cde.DAO.FriendDAO;
import com.niit.cde.Model.Friend;

public class FriendDAOImpl implements FriendDAO {
	@Autowired
	SessionFactory sessionFactory;

	public boolean add(Friend friend) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().save(friend);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
	}
	

	public boolean update(Friend friend) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(friend);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
	}
	

	public boolean delete(String username, String friendId) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(friendId);
			return true;
			}
		catch(Exception e)
		{
			return false;
		}
	}	
	
	public void setOnline(String username) {
		// TODO Auto-generated method stub
		
	}

	public void setOffline(String username) {
		// TODO Auto-generated method stub
		
	}

	public List<Friend> getMyFriend(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Friend> getFriendRequestSentByMe(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Friend> getNewFriendRequest(String friendId) {
		// TODO Auto-generated method stub
		return null;
	}

}
