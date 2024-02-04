package com.amadeus.searchApi.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="havaalanlari")
public class Havaalanlari {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sehir")
	private String sehir;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Havaalanlari(int id, String sehir) {
		this.id = id;
		this.sehir = sehir;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

}
