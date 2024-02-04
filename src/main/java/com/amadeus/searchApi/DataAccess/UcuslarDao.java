package com.amadeus.searchApi.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amadeus.searchApi.Entities.Ucuslar;

import jakarta.persistence.EntityManager;
@Repository
public class UcuslarDao {
	 private EntityManager manager;

	 @Autowired
	public UcuslarDao(EntityManager manager) {
		this.manager = manager;
	}


	public void add(Ucuslar ucuslar) {
		Session session=manager.unwrap(Session.class);
		session.save(ucuslar);
		
	}


	public void update(Ucuslar ucuslar) {
		Session session=manager.unwrap(Session.class);
		session.update(ucuslar);
		
	}


	public void delete(Ucuslar ucuslar) {
		Session session=manager.unwrap(Session.class);
		Ucuslar u1=session.get(Ucuslar.class, ucuslar.getId());
		session.delete(u1);
	}


	public List<Ucuslar> getAll() {
		Session session=manager.unwrap(Session.class);
		List<Ucuslar> u2=session.createQuery("from Ucuslar",Ucuslar.class).getResultList();
		return u2;
	}
}
