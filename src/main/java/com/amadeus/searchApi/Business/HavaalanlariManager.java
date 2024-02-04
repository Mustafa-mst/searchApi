package com.amadeus.searchApi.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amadeus.searchApi.DataAccess.HavaalanlariDao;
import com.amadeus.searchApi.Entities.Havaalanlari;

@Service
public class HavaalanlariManager {
	private HavaalanlariDao havaalanlari;
	@Autowired
	public HavaalanlariManager(HavaalanlariDao havaalanlari) {

		this.havaalanlari =havaalanlari ;
	}

	public List<Havaalanlari>getAll(){
		return this.havaalanlari.getAll();
	}
	public void add(Havaalanlari havaalanlari) {
		this.havaalanlari.add(havaalanlari);
	}

	public void update(Havaalanlari havaalanlari) {
		this.havaalanlari.update(havaalanlari);
	}

	public void delete(Havaalanlari havaalanlari) {
		this.havaalanlari.delete(havaalanlari);
	}
}
