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
@Table(name = "MainKullaniciTable")
public class MainKullanici {
	
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

	public MainKullanici(String kullaniciTC, String kullaniciAd, String kullaniciSoyad, String kullaniciAnne,
			String kullaniciBaba, String kullaniciDogumTarih, File kullaniciResim, String kullaniciCinsiyet,
			String kullaniciOzelDurum, String kullaniciFormasyon, String kullaniciMail, String kullaniciTelefon,
			String kullaniciAdres, String kullaniciUniversite, String kullaniciFakulte, String kullaniciProgram,
			String kullaniciTarih, double kullaniciMezunNotu) {
		super();
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

	public Long getKullaniciID() {
		return kullaniciID;
	}

	public void setKullaniciID(Long kullaniciID) {
		this.kullaniciID = kullaniciID;
	}

	public String getKullaniciTC() {
		return kullaniciTC;
	}

	public void setKullaniciTC(String kullaniciTC) {
		this.kullaniciTC = kullaniciTC;
	}

	public String getKullaniciAd() {
		return kullaniciAd;
	}

	public void setKullaniciAd(String kullaniciAd) {
		this.kullaniciAd = kullaniciAd;
	}

	public String getKullaniciSoyad() {
		return kullaniciSoyad;
	}

	public void setKullaniciSoyad(String kullaniciSoyad) {
		this.kullaniciSoyad = kullaniciSoyad;
	}

	public String getKullaniciAnne() {
		return kullaniciAnne;
	}

	public void setKullaniciAnne(String kullaniciAnne) {
		this.kullaniciAnne = kullaniciAnne;
	}

	public String getKullaniciBaba() {
		return kullaniciBaba;
	}

	public void setKullaniciBaba(String kullaniciBaba) {
		this.kullaniciBaba = kullaniciBaba;
	}

	public String getKullaniciDogumTarih() {
		return kullaniciDogumTarih;
	}

	public void setKullaniciDogumTarih(String kullaniciDogumTarih) {
		this.kullaniciDogumTarih = kullaniciDogumTarih;
	}

	public File getKullaniciResim() {
		return kullaniciResim;
	}

	public void setKullaniciResim(File kullaniciResim) {
		this.kullaniciResim = kullaniciResim;
	}

	public String getKullaniciCinsiyet() {
		return kullaniciCinsiyet;
	}

	public void setKullaniciCinsiyet(String kullaniciCinsiyet) {
		this.kullaniciCinsiyet = kullaniciCinsiyet;
	}

	public String getKullaniciOzelDurum() {
		return kullaniciOzelDurum;
	}

	public void setKullaniciOzelDurum(String kullaniciOzelDurum) {
		this.kullaniciOzelDurum = kullaniciOzelDurum;
	}

	public String getKullaniciFormasyon() {
		return kullaniciFormasyon;
	}

	public void setKullaniciFormasyon(String kullaniciFormasyon) {
		this.kullaniciFormasyon = kullaniciFormasyon;
	}

	public String getKullaniciMail() {
		return kullaniciMail;
	}

	public void setKullaniciMail(String kullaniciMail) {
		this.kullaniciMail = kullaniciMail;
	}

	public String getKullaniciTelefon() {
		return kullaniciTelefon;
	}

	public void setKullaniciTelefon(String kullaniciTelefon) {
		this.kullaniciTelefon = kullaniciTelefon;
	}

	public String getKullaniciAdres() {
		return kullaniciAdres;
	}

	public void setKullaniciAdres(String kullaniciAdres) {
		this.kullaniciAdres = kullaniciAdres;
	}

	public String getKullaniciUniversite() {
		return kullaniciUniversite;
	}

	public void setKullaniciUniversite(String kullaniciUniversite) {
		this.kullaniciUniversite = kullaniciUniversite;
	}

	public String getKullaniciFakulte() {
		return kullaniciFakulte;
	}

	public void setKullaniciFakulte(String kullaniciFakulte) {
		this.kullaniciFakulte = kullaniciFakulte;
	}

	public String getKullaniciProgram() {
		return kullaniciProgram;
	}

	public void setKullaniciProgram(String kullaniciProgram) {
		this.kullaniciProgram = kullaniciProgram;
	}

	public String getKullaniciTarih() {
		return kullaniciTarih;
	}

	public void setKullaniciTarih(String kullaniciTarih) {
		this.kullaniciTarih = kullaniciTarih;
	}

	public double getKullaniciMezunNotu() {
		return kullaniciMezunNotu;
	}

	public void setKullaniciMezunNotu(double kullaniciMezunNotu) {
		this.kullaniciMezunNotu = kullaniciMezunNotu;
	}
	
	
}
