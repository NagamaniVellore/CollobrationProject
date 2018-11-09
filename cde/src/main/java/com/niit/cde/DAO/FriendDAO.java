package com.niit.cde.DAO;

import java.util.List;

import com.niit.cde.Model.Friend;


public interface FriendDAO {
public boolean add(Friend friend);
	
	public boolean update(Friend friend);
	
	public boolean delete(String username, String friendId);
	
	public void setOnline(String username);
	
	public void setOffline(String username);
	
	public List<Friend> getMyFriend(String username);
	
	public List<Friend> getFriendRequestSentByMe(String username);
	
	public List<Friend> getNewFriendRequest(String friendId);


}
