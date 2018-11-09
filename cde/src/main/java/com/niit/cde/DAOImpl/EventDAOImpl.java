package com.niit.cde.DAOImpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.cde.DAO.EventDAO;
import com.niit.cde.Model.Event;
@SuppressWarnings("deprecation")
@Repository("eventDAO")
@EnableTransactionManagement

public class EventDAOImpl implements EventDAO {

	public void save(Event event) {
		// TODO Auto-generated method stub
		
	}

	public void update(Event event) {
		// TODO Auto-generated method stub
		
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	public List<Event> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
