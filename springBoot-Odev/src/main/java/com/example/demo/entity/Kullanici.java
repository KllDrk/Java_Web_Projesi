package com.example.demo.entity;

import java.io.File;

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
@Table(name = "KullaniciTable")
public class Kullanici {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long kullaniciID;
	
	private String kullaniciTC;
	private String kullaniciAd;
	private String kullaniciSoyad;
	private String kullaniciAnne;
	private String kullaniciBaba;
	private String kullaniciDogumTarih;
	private File kullaniciResim;
	private String kullaniciCinsiyet;
	private String kullaniciOzelDurum;
	private String kullaniciFormasyon;
	
	private String kullaniciMail;
	private String kullaniciTelefon;
	private String kullaniciAdres;
	
	private String kullaniciUniversite;
	private String kullaniciFakulte;
	private String kullaniciProgram;
	private String kullaniciTarih;
	
	private double kullaniciMezunNotu;
	
	
	
}
