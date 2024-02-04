package com.amadeus.searchApi.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amadeus.searchApi.Business.UcuslarManager;
import com.amadeus.searchApi.Entities.Ucuslar;
@RestController
@RequestMapping("/api")
public class UcuslarController {
private UcuslarManager manager;
	
	@Autowired
	public UcuslarController(UcuslarManager manager) {
		this.manager = manager;
	}
	
	@GetMapping("/ucuslar")
	public List<Ucuslar> get(){
		return manager.get();
	}
	
	@PostMapping("/ucuslar/add")
	public void add(@RequestBody Ucuslar ucuslar) {
		 manager.add(ucuslar);
	}
	
	@PostMapping("/ucuslar/update")
	public void update(@RequestBody Ucuslar ucuslar) {
		 manager.update(ucuslar);
	}
	
	@PostMapping("/ucuslar/delete")
	public void delete(@RequestBody Ucuslar ucuslar) {
		 manager.delete(ucuslar);
	}
}
