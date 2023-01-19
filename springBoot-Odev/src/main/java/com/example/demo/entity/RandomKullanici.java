package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "RandomKullaniciTable")
public class RandomKullanici {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long randomKullaniciID;
	private int randomKullaniciSayisi;
	
	public Long getRandomKullaniciID() {
		return randomKullaniciID;
	}
	
	public void setRandomKullaniciID(Long randomKullaniciID) {
		this.randomKullaniciID = randomKullaniciID;
	}
	
	public int getRandomKullaniciSayisi() {
		return randomKullaniciSayisi;
	}
	
	public void setRandomKullaniciSayisi(int randomKullaniciSayisi) {
		this.randomKullaniciSayisi = randomKullaniciSayisi;
	}
}
