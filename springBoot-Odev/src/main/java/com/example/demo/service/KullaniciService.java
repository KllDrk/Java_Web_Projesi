package com.example.demo.service;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.LogKullanici;
import com.example.demo.entity.MainKullanici;
import com.example.demo.entity.RandomKullanici;

@Repository
public interface KullaniciService {

	void registerKullanici(MainKullanici mainKullanici);
	
	List<MainKullanici> getKullanici();
	
	MainKullanici getByIDKullanici(long ID);
	
	void deleteKullanici(long ID);

	void adminPanelAddKullanici(MainKullanici mainKullanici);
	
	MainKullanici updateKullanici(long ID, MainKullanici mainKullaniciEdit);
	
	void adminPanelRandomKullanici(RandomKullanici randomKullanici);
	
	List<LogKullanici> getLog();
	
	void adminPanelLogKullanici(LogKullanici logKullanici);
	
	void logControllerMain(String logControl, String intLogControl, MainKullanici mainKullanici);
	
	void logControllerRandom(String logControl, String intLogControl, RandomKullanici randomKullanici);
	
	void logControllerMainRandom(String logControl, String intLogControl);
	
	LogKullanici createLogKullanici();
	
	void createRandomMainKullanici(MainKullanici mainKullanici);
	
	void randomController(int i, MainKullanici mainKullanici);
	
	String randomKullaniciTC();
	
	String randomKullaniciAd();

	String randomKullaniciSoyad();

	String randomKullaniciAnne();

	String randomKullaniciBaba();

	String randomKullaniciDogumTarih();

	File randomKullaniciResim();

	String randomKullaniciCinsiyet();

	String randomKullaniciOzelDurum();

	String randomKullaniciFormasyon();

	String randomKullaniciMail();

	String randomKullaniciTelefon();

	String randomKullaniciAdres();

	String randomKullaniciUniversite();

	String randomKullaniciFakulte();

	String randomKullaniciProgram();

	String randomKullaniciTarih();

	double randomKullaniciMezunNotu();
	
}
