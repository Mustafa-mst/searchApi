package com.amadeus.searchApi.Business;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amadeus.searchApi.DataAccess.UcuslarDao;
import com.amadeus.searchApi.Entities.Ucuslar;

@Service
public class UcuslarManager {
	
private UcuslarDao ucus;
@Autowired
public UcuslarManager(UcuslarDao ucus) {

	this.ucus = ucus;
}

public List<Ucuslar>get(){
	return this.ucus.getAll();
}

public void add(Ucuslar ucuslar) {
	this.ucus.add(ucuslar);
}

public void update(Ucuslar ucuslar) {
	this.ucus.update(ucuslar);
}

public void delete(Ucuslar ucuslar) {
	this.ucus.delete(ucuslar);
}

}
