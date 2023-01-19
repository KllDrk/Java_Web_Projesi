package com.example.demo.dto;

import java.io.File;
import java.io.Serializable;

import com.example.demo.entity.MainKullanici;

import lombok.Getter;

@Getter
public final class MainKullaniciViewDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
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

	public MainKullaniciViewDTO(String kullaniciTC, String kullaniciAd, String kullaniciSoyad, String kullaniciAnne,
			String kullaniciBaba, String kullaniciDogumTarih, File kullaniciResim, String kullaniciCinsiyet,
			String kullaniciOzelDurum, String kullaniciFormasyon, String kullaniciMail, String kullaniciTelefon,
			String kullaniciAdres, String kullaniciUniversite, String kullaniciFakulte, String kullaniciProgram,
			String kullaniciTarih, double kullaniciMezunNotu) {
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
	
	public static MainKullaniciViewDTO of(MainKullanici mainKullanici) {
		return new MainKullaniciViewDTO(mainKullanici.getKullaniciTC(),mainKullanici.getKullaniciAd(),mainKullanici.getKullaniciSoyad(),
				mainKullanici.getKullaniciAnne(),mainKullanici.getKullaniciBaba(),mainKullanici.getKullaniciDogumTarih(),mainKullanici.getKullaniciResim(),
				mainKullanici.getKullaniciCinsiyet(),mainKullanici.getKullaniciOzelDurum(),mainKullanici.getKullaniciFormasyon(),mainKullanici.getKullaniciMail(),
				mainKullanici.getKullaniciTelefon(),mainKullanici.getKullaniciAdres(),mainKullanici.getKullaniciUniversite(),mainKullanici.getKullaniciFakulte(),
				mainKullanici.getKullaniciProgram(),mainKullanici.getKullaniciTarih(),mainKullanici.getKullaniciMezunNotu());
	}
}
