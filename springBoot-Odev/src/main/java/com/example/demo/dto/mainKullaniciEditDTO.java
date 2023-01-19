package com.example.demo.dto;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AnaKullaniciTable1")
public class mainKullaniciEditDTO {
	
	@Id
	private final Long kullaniciID;
	private final String kullaniciTC;
	private final String kullaniciAd;
	private final String kullaniciSoyad;
	private final String kullaniciAnne;
	private final String kullaniciBaba;
	private final String kullaniciDogumTarih;
	private final File kullaniciResim;
	private final String kullaniciCinsiyet;
	private final String kullaniciOzelDurum;
	private final String kullaniciFormasyon;
	
	private final String kullaniciMail;
	private final String kullaniciTelefon;
	private final String kullaniciAdres;
	
	private final String kullaniciUniversite;
	private final String kullaniciFakulte;
	private final String kullaniciProgram;
	private final String kullaniciTarih;
	
	private final double kullaniciMezunNotu;

	public mainKullaniciEditDTO(Long kullaniciID, String kullaniciTC, String kullaniciAd, String kullaniciSoyad,
			String kullaniciAnne, String kullaniciBaba, String kullaniciDogumTarih, File kullaniciResim,
			String kullaniciCinsiyet, String kullaniciOzelDurum, String kullaniciFormasyon, String kullaniciMail,
			String kullaniciTelefon, String kullaniciAdres, String kullaniciUniversite, String kullaniciFakulte,
			String kullaniciProgram, String kullaniciTarih, double kullaniciMezunNotu) {
		super();
		this.kullaniciID = kullaniciID;
		this.kullaniciTC = kullaniciTC;
		this.kullaniciAd = kullaniciAd;
		this.kullaniciSoyad = kullaniciSoyad;
		this.kullaniciAnne = kullaniciAnne;
		this.kullaniciBaba = kullaniciBaba;
		this.kullaniciDogumTarih = kullaniciDogumTarih;
		this.kullaniciResim = kullaniciResim;
		this.kullaniciCinsiyet = kullaniciCinsiyet;
		this.kullaniciOzelDurum = kullaniciOzelDurum;
		this.kullaniciFormasyon = kullaniciFormasyon;
		this.kullaniciMail = kullaniciMail;
		this.kullaniciTelefon = kullaniciTelefon;
		this.kullaniciAdres = kullaniciAdres;
		this.kullaniciUniversite = kullaniciUniversite;
		this.kullaniciFakulte = kullaniciFakulte;
		this.kullaniciProgram = kullaniciProgram;
		this.kullaniciTarih = kullaniciTarih;
		this.kullaniciMezunNotu = kullaniciMezunNotu;
	}

	
	
	
}
