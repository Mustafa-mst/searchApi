package com.amadeus.searchApi.Entities;



import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="ucuslar")
public class Ucuslar {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="kalkis_havaalani")
	private String kalkis_havaalani;
	
	@Column(name="varis_havaalani")
	private String varis_havaalani;
	
	@Column(name="kalkis_tarih")
	private Date kalkis_tarih;
	
	@Column(name="donus_tarih")
	private Date donus_tarih;
	
	public Ucuslar(int id, String kalkis_havaalani, String varis_havaalani, Date kalkis_tarih, Date donus_tarih,
			int fiyat) {
		this.id = id;
		this.kalkis_havaalani = kalkis_havaalani;
		this.varis_havaalani = varis_havaalani;
		this.kalkis_tarih = kalkis_tarih;
		this.donus_tarih = donus_tarih;
		this.fiyat = fiyat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKalkis_havaalani() {
		return kalkis_havaalani;
	}

	public void setKalkis_havaalani(String kalkis_havaalani) {
		this.kalkis_havaalani = kalkis_havaalani;
	}

	public String getVaris_havaalani() {
		return varis_havaalani;
	}

	public void setVaris_havaalani(String varis_havaalani) {
		this.varis_havaalani = varis_havaalani;
	}

	public Date getKalkis_tarih() {
		return kalkis_tarih;
	}

	public void setKalkis_tarih(Date kalkis_tarih) {
		this.kalkis_tarih = kalkis_tarih;
	}

	public Date getDonus_tarih() {
		return donus_tarih;
	}

	public void setDonus_tarih(Date donus_tarih) {
		this.donus_tarih = donus_tarih;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	@Column(name="fiyat")
	private int fiyat;

}
