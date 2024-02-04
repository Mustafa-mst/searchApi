package com.amadeus.searchApi.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import  com.amadeus.searchApi.Business.HavaalanlariManager;
import com.amadeus.searchApi.Entities.Havaalanlari;

@RestController
@RequestMapping("/api")
public class HavaalanlariController {
	private HavaalanlariManager manager;
	
	@Autowired
	public HavaalanlariController(HavaalanlariManager manager) {
		this.manager = manager;
	}
	
	@GetMapping("/havaalanlari")
	public List<Havaalanlari> get(){
		return manager.getAll();
	}
	
	@PostMapping("/havaalanlari/add")
	public void add(@RequestBody Havaalanlari havaalanlari) {
		 manager.add(havaalanlari);
	}
	
	@PostMapping("/havaalanlari/update")
	public void update(@RequestBody Havaalanlari havaalanlari) {
		 manager.update(havaalanlari);
	}
	
	@PostMapping("/havaalanlari/delete")
	public void delete(@RequestBody Havaalanlari havaalanlari) {
		 manager.delete(havaalanlari);
	}
	

}
