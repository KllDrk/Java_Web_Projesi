package com.example.demo.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LogKullanici;
import com.example.demo.entity.MainKullanici;
import com.example.demo.entity.RandomKullanici;
import com.example.demo.repo.KullaniciRepo;
import com.example.demo.repo.LogRepo;
import com.example.demo.repo.RandomKullaniciRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KullaniciServiceImpl implements KullaniciService{
	
	@Autowired
	private final KullaniciRepo kullaniciRepository;
	
	@Autowired
	private final RandomKullaniciRepo randomKullaniciRepository;

	@Autowired
	private final LogRepo logRepository;
	
	@Override
	public void registerKullanici(MainKullanici mainKullanici) {kullaniciRepository.save(mainKullanici);}

	@Override
	public List<MainKullanici> getKullanici() {return (List<MainKullanici>) kullaniciRepository.findAll();}

	@Override
	public MainKullanici getByIDKullanici(long kullaniciID) {return kullaniciRepository.findById(kullaniciID).get();}
	
	@Override
	public void deleteKullanici(long ID) {kullaniciRepository.deleteById(ID);}

	@Override
	public void adminPanelAddKullanici(MainKullanici mainKullanici) {kullaniciRepository.save(mainKullanici);}

	@Override
	public MainKullanici updateKullanici(long ID,MainKullanici mainKullaniciEdit) {
		MainKullanici editMainKullanici = kullaniciRepository.findById(ID).orElseThrow();
		editMainKullanici.setKullaniciID			(mainKullaniciEdit.getKullaniciID());
		editMainKullanici.setKullaniciTC			(mainKullaniciEdit.getKullaniciTC());
		editMainKullanici.setKullaniciAd			(mainKullaniciEdit.getKullaniciAd());
		editMainKullanici.setKullaniciSoyad			(mainKullaniciEdit.getKullaniciSoyad());
		editMainKullanici.setKullaniciAnne			(mainKullaniciEdit.getKullaniciAnne());
		editMainKullanici.setKullaniciBaba			(mainKullaniciEdit.getKullaniciBaba());
		editMainKullanici.setKullaniciDogumTarih	(mainKullaniciEdit.getKullaniciDogumTarih());
		editMainKullanici.setKullaniciResim			(mainKullaniciEdit.getKullaniciResim());
		editMainKullanici.setKullaniciCinsiyet		(mainKullaniciEdit.getKullaniciCinsiyet());
		editMainKullanici.setKullaniciOzelDurum		(mainKullaniciEdit.getKullaniciOzelDurum());
		editMainKullanici.setKullaniciFormasyon		(mainKullaniciEdit.getKullaniciFormasyon());
		editMainKullanici.setKullaniciMail			(mainKullaniciEdit.getKullaniciMail());
		editMainKullanici.setKullaniciTelefon		(mainKullaniciEdit.getKullaniciTelefon());
		editMainKullanici.setKullaniciAdres			(mainKullaniciEdit.getKullaniciAdres());
		editMainKullanici.setKullaniciUniversite	(mainKullaniciEdit.getKullaniciUniversite());
		editMainKullanici.setKullaniciFakulte		(mainKullaniciEdit.getKullaniciFakulte());
		editMainKullanici.setKullaniciProgram		(mainKullaniciEdit.getKullaniciProgram());
		editMainKullanici.setKullaniciTarih			(mainKullaniciEdit.getKullaniciTarih());
		editMainKullanici.setKullaniciMezunNotu		(mainKullaniciEdit.getKullaniciMezunNotu());
		kullaniciRepository.save(editMainKullanici);
		return editMainKullanici;
	}

	@Override
	public void adminPanelRandomKullanici(RandomKullanici randomKullanici) {randomKullaniciRepository.save(randomKullanici);}

	@Override
	public List<LogKullanici> getLog() {return (List<LogKullanici>) logRepository.findAll();}

	@Override
	public void adminPanelLogKullanici(LogKullanici logKullanici) {logRepository.save(logKullanici);}

	@Override
	public void logControllerMain(String logControl, String intLogControl, MainKullanici mainKullanici) {
		LogKullanici logKullanici = createLogKullanici();
		String string = null;
		switch(logControl) {
		case "register":{
			switch(intLogControl) {
			case "Get"	  :{string= "Register Sayfasinda Yeni Bir Kullanici Olusturuldu.";break;}
			case "Post"   :{string="Register Sayfasinda"+ mainKullanici.getKullaniciAd() + " " + mainKullanici.getKullaniciSoyad() + " Sisteme Kayidi Yapilmistir.";break;}
			default		  :{string = "Register Sayfasi icin Boyle bir Islem Tanimlanmamistir.";break;}}break;}
		case "AdminPanelAdd":{
			switch(intLogControl) {
			case "Request":{string = "AdminPanelAdd Sayfasina Yonlendirildi.";break;}
			case "Get"	  :{string = "AdminPanelAdd Sayfasinda Yeni Bir Kullanici Olusturuldu.";break;}
			case "Post"   :{string = "AdminPanelAdd Sayfasinda"+ mainKullanici.getKullaniciAd() + " " + mainKullanici.getKullaniciSoyad() + " Sisteme Kayidi Yapilmistir.";break;}
			default		  :{string = "AdminPanelAdd Sayfasi icin Boyle bir Islem Tanimlanmamistir.";break;}}break;}
		case "AdminPanelEdit":{
			switch(intLogControl) {
			case "Request":{string = "AdminPanelEdit Sayfasina Yonlendirildi.";break;}
			case "Get"	  :{string = "AdminPanelEdit Sayfasinda "+ mainKullanici.getKullaniciAd() + " " + mainKullanici.getKullaniciSoyad() +" Isimli Kullanici Bulundu.";break;}
			case "Post"	  :{string = "AdminPanelEdit Sayfasinda "+ mainKullanici.getKullaniciAd() + " " + mainKullanici.getKullaniciSoyad() +" Isimli Kullanici Guncellendi.";break;}
			default		  :{string = "AdminPanelEdit Sayfasi icin Boyle bir Islem Tanimlanmamıistir.";break;}}break;}
		case "AdminPanelDelete":{
			switch(intLogControl) {
			case "Request":{string = "AdminPanelDelete Sayfasina Yonlendirildi.";break;}
			case "Get"	  :{string = "AdminPanelDelete Sayfasinda "+ mainKullanici.getKullaniciAd() + " " + mainKullanici.getKullaniciSoyad() +" Isimli Kullanici Bulundu.";break;}
			case "Post"   :{string = "AdminPanelEdit Sayfasinda "+ mainKullanici.getKullaniciAd() + " " + mainKullanici.getKullaniciSoyad() +" Isimli Kullanici Silindi.";break;}
			default		  :{string = "AdminPanelDelete Sayfasi icin Boyle bir Islem Tanimlanmamistir.";break;}}break;}
		case "AdminPanelFind":{
			switch(intLogControl) {
			case "Request":{string = "AdminPanelFind Sayfasina Yonlendirildi.";break;}
			case "Get"	  :{string = "AdminPanelFind Sayfasinda "+ mainKullanici.getKullaniciAd() + " " + mainKullanici.getKullaniciSoyad() +" Isimli Kullanici Bulundu.";break;}
			case "Post"	  :{string = "AdminPanelFind Sayfasinda "+ mainKullanici.getKullaniciAd() + " " + mainKullanici.getKullaniciSoyad() +" Isimli Kullanici Gosterildi.";break;}
			default		  :{string = "AdminPanelFind Sayfasi icin Boyle bir Islem Tanimlanmamistir.";break;}}break;}
		default				 :{string = "MainKullanici icin Boyle bir Islem Tanimlanmamistir.";break;}}
		logKullanici.setLogAciklama(string);
		adminPanelLogKullanici(logKullanici);
	}

	@Override
	public void logControllerRandom(String logControl, String intLogControl, RandomKullanici randomKullanici) {
		LogKullanici logKullanici = createLogKullanici();
		String string = "";
		switch(logControl) {
		case "AdminPanelRandomKullanici":{
			switch(intLogControl) {
			case "Request":{string = "AdminPanelRandomKullanici Sayfasina Yonlendirildi.";break;}
			case "Get"	  :{string = "AdminPanelRandomKullanici Sayfasinda Yeni Bir Random Kullanici Olusturuldu.";break;}
			case "Post"   :{string = "AdminPanelRandomKullanici Sayfasinda "+ randomKullanici.getRandomKullaniciSayisi() +" Adet Kullanici Olusturuldu.";break;}
			default		  :{string = "AdminPanelRandomKullanici icin Boyle bir Islem Tanimlanmamistir.";break;}}break;}
		default							:{string = "RandomKullanici icin Boyle bir Islem Tanimlanmamistir.";break;}}
		logKullanici.setLogAciklama(string);
		adminPanelLogKullanici(logKullanici);
	}

	@Override
	public void logControllerMainRandom(String logControl, String intLogControl) {
		LogKullanici logKullanici = createLogKullanici();
		String string = "";
		switch(logControl) {
		case "AdminPanel":{
			switch(intLogControl) {
			case "Request":{string = "AdminPanel Sayfasina Yonlendirildi.";break;}
			case "Get"	  :{string = "AdminPanel Sayfasinda Tum Kullanicilar Gosterildi.";break;}
			default		  :{string = "AdminPanel icin Boyle bir Islem Tanimlanmamistir.";break;}}break;}
		case "AdminPanelLog":{
			switch(intLogControl) {
			case "Request":{string = "AdminPanelLog Sayfasina Yonlendirildi.";break;}
			case "Get"	  :{string = "AdminPanelLog Sayfasinda Tum Loglar Gosterildi.";break;}
			default		  :{string = "AdminPanelLog icin Boyle bir Islem Tanimlanmamistir.";break;}}break;}
		default				:{string = "Her iki kullanici icin Boyle bir Islem Tanimlanmamistir.";break;}}
		logKullanici.setLogAciklama(string);
		adminPanelLogKullanici(logKullanici);
	}
	
	@Override
	public LogKullanici createLogKullanici() {return new LogKullanici();}

	@Override
	public void createRandomMainKullanici(MainKullanici mainKullanici) {
		for(int i = 0; i < 18 ; i++) {randomController(i,mainKullanici);}
		kullaniciRepository.save(mainKullanici);
	}
	
	@Override
	public void randomController(int i, MainKullanici mainKullanici) {
		switch(i){
		case 0 :{mainKullanici.setKullaniciTC(randomKullaniciTC());break;}
		case 1 :{mainKullanici.setKullaniciAd(randomKullaniciAd());break;}
		case 2 :{mainKullanici.setKullaniciSoyad(randomKullaniciSoyad());break;}
		case 3 :{mainKullanici.setKullaniciAnne(randomKullaniciAnne());break;}
		case 4 :{mainKullanici.setKullaniciBaba(randomKullaniciBaba());break;}
		case 5 :{mainKullanici.setKullaniciDogumTarih(randomKullaniciDogumTarih());break;}
		case 6 :{mainKullanici.setKullaniciResim(randomKullaniciResim());break;}
		case 7 :{mainKullanici.setKullaniciCinsiyet(randomKullaniciCinsiyet());break;}
		case 8 :{mainKullanici.setKullaniciOzelDurum(randomKullaniciOzelDurum());break;}
		case 9 :{mainKullanici.setKullaniciFormasyon(randomKullaniciFormasyon());break;}
		case 10:{mainKullanici.setKullaniciMail(randomKullaniciMail());break;}
		case 11:{mainKullanici.setKullaniciTelefon(randomKullaniciTelefon());break;}
		case 12:{mainKullanici.setKullaniciAdres(randomKullaniciAdres());break;}
		case 13:{mainKullanici.setKullaniciUniversite(randomKullaniciUniversite());break;}
		case 14:{mainKullanici.setKullaniciFakulte(randomKullaniciFakulte());break;}
		case 15:{mainKullanici.setKullaniciProgram(randomKullaniciProgram());break;}
		case 16:{mainKullanici.setKullaniciTarih(randomKullaniciTarih());break;}
		case 17:{mainKullanici.setKullaniciMezunNotu(randomKullaniciMezunNotu());break;}
		default:{break;}
		}
	}

	@Override
	public String randomKullaniciTC() {
		String TC = "";
		for(int i = 0; i < 11; i++) {TC += (char)('a'+Math.random()*('z'-'a'+1));}
		return TC;
	}

	@Override
	public String randomKullaniciAd() {
		String Ad = "";
		for(int i = 0 ; i < (int) (3 + Math.random()*30) ; i++) {Ad += (char)('a'+Math.random()*('z'-'a'+1));}
		return Ad;
	}

	@Override
	public String randomKullaniciSoyad() {
		String Soyad = "";
		for(int i = 0 ; i < (int) (3 + Math.random()*30) ; i++) {Soyad += (char)('a'+Math.random()*('z'-'a'+1));}
		return Soyad;
	}

	@Override
	public String randomKullaniciAnne() {
		String Anne = "";
		for(int i = 0 ; i < (int) (3 + Math.random()*30) ; i++) {Anne += (char)('a'+Math.random()*('z'-'a'+1));}
		return Anne;
	}

	@Override
	public String randomKullaniciBaba() {
		String Baba = "";
		for(int i = 0 ; i < (int) (3 + Math.random()*30) ; i++) {Baba += (char)('a'+Math.random()*('z'-'a'+1));}
		return Baba;
	}

	@Override
	public String randomKullaniciDogumTarih() {
		String DogumTarih = "";
		for(int i = 0 ; i < 4 ; i++) {DogumTarih += (char)('0'+Math.random()*('9'-'0'+1));}
		for(int i = 0 ; i < 2 ; i++) {DogumTarih += "-"; for(int j = 0 ; j < 2 ; j++) {DogumTarih += (char)('0'+Math.random()*('9'-'0'+1));}}
		return DogumTarih;
	}

	@Override
	public File randomKullaniciResim() {return null;}

	@Override
	public String randomKullaniciCinsiyet() {
		String Cinsiyet = "";
		switch((int) (Math.random() * 2)) {
		case 0:{Cinsiyet += "erkek";break;}
		case 1:{Cinsiyet += "kadin";break;}}
		return Cinsiyet;
	}

	@Override
	public String randomKullaniciOzelDurum() {
		String OzelDurum = "";
		switch((int) (Math.random() * 2)) {
		case 0:{OzelDurum += "evet";break;}
		case 1:{OzelDurum += "hayir";break;}}
		return OzelDurum;
	}

	@Override
	public String randomKullaniciFormasyon() {
		String Formasyon = "";
		switch((int) (Math.random() * 15)) {
		case 0 :{Formasyon += "nullFormasyon";break;}
		case 1 :{Formasyon += "biyoloji";break;}
		case 2 :{Formasyon += "felsefe";break;}
		case 3 :{Formasyon += "fizik";break;}
		case 4 :{Formasyon += "gorselSanatlar";break;}
		case 5 :{Formasyon += "grafik";break;}
		case 6 :{Formasyon += "imamaHatipMeslekDersler";break;}
		case 7 :{Formasyon += "ingilizce";break;}
		case 8 :{Formasyon += "kimya/kimyaTeknolojisi";break;}
		case 9 :{Formasyon += "matematik";break;}
		case 10:{Formasyon += "muhasebeVeFinansman";break;}
		case 11:{Formasyon += "muzik";break;}
		case 12:{Formasyon += "tarih";break;}
		case 13:{Formasyon += "turkDiliVeEdebiyati";break;}
		case 14:{Formasyon += "bedenEgitimi";break;}}
		return Formasyon;
	}

	@Override
	public String randomKullaniciMail() {
		String Mail = "";
		for(int i = 0 ; i < (int) (3 + Math.random()*30) ; i++) {Mail += (char)('a'+Math.random()*('z'-'a'+1));}
		Mail += "@DenemeMail.com";
		return Mail;
	}

	@Override
	public String randomKullaniciTelefon() {
		String Telefon = "0";
		for(int i = 0 ; i < 2 ; i++) {Telefon += " "; for(int j = 0 ; j < 3 ; j++) {Telefon += (char)('0'+Math.random()*('9'-'0'+1));}}
		for(int i = 0 ; i < 2 ; i++) {Telefon += " "; for(int j = 0 ; j < 2 ; j++) {Telefon += (char)('0'+Math.random()*('9'-'0'+1));}}
		return Telefon;
	}

	@Override
	public String randomKullaniciAdres() {
		String Adres = "";
		for(int i = 0 ; i < (int) (50 + Math.random()*150) ; i++) {Adres += (char)('a'+Math.random()*('z'-'a'+1));}
		return Adres;
	}

	@Override
	public String randomKullaniciUniversite() {
		String Universite = "";
		for(int i = 0 ; i < (int) (20 + Math.random()*50) ; i++) {Universite += (char)('a'+Math.random()*('z'-'a'+1));}
		Universite += " Universitesi";
		return Universite;
	}

	@Override
	public String randomKullaniciFakulte() {
		String Fakulte = "";
		for(int i = 0 ; i < (int) (20 + Math.random()*20) ; i++) {Fakulte += (char)('a'+Math.random()*('z'-'a'+1));}
		Fakulte += " Fakultesi";
		return Fakulte;
	}

	@Override
	public String randomKullaniciProgram() {
		/*
		String Program = "";
		for(int i = 0 ; i < (int) ( Math.random()*20) ; i++) {Program += (char)('a'+Math.random()*('z'-'a'+1));}
		Program += " Programı";
		return Program;
		*/
		return null;
	}

	@Override
	public String randomKullaniciTarih() {
		String Tarih = "";
		for(int i = 0 ; i < 4 ; i++) {Tarih += (char)('0'+Math.random()*('9'-'0'+1));}
		for(int i = 0 ; i < 2 ; i++) {Tarih += "-"; for(int j = 0 ; j < 2 ; j++) {Tarih += (char)('0'+Math.random()*('9'-'0'+1));}}
		return Tarih;
	}

	@Override
	public double randomKullaniciMezunNotu() {
		return (double) (2 + Math.random()*2);
	}
}
