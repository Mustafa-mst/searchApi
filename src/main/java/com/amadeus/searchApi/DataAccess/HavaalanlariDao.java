package com.amadeus.searchApi.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amadeus.searchApi.Entities.Havaalanlari;

import jakarta.persistence.EntityManager;
@Repository
public class HavaalanlariDao {
 private EntityManager manager;

 @Autowired
public HavaalanlariDao(EntityManager manager) {
	this.manager = manager;
}


public void add(Havaalanlari havaalanlari) {
	Session session=manager.unwrap(Session.class);
	session.save(havaalanlari);
	
}


public void update(Havaalanlari havaalanlari) {
	Session session=manager.unwrap(Session.class);
	session.update(havaalanlari);
	
}


public void delete(Havaalanlari havaalanlari) {
	Session session=manager.unwrap(Session.class);
	Havaalanlari h1=session.get(Havaalanlari.class, havaalanlari.getId());
	session.delete(h1);
}


public List<Havaalanlari> getAll() {
	Session session=manager.unwrap(Session.class);
	List<Havaalanlari> h2=session.createQuery("from Havaalanlari",Havaalanlari.class).getResultList();
	return h2;
}
 
 
 
}
