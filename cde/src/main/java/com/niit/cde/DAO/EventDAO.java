package com.niit.cde.DAO;

import java.util.List;

import com.niit.cde.Model.Event;



public interface EventDAO {
public void save(Event event);
	
	public void update(Event event);
	
	public void delete(String id);
	
	public List<Event> list();
	

}
