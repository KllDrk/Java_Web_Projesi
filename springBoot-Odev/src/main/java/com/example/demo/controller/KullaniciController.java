package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.LogKullanici;
import com.example.demo.entity.MainKullanici;
import com.example.demo.entity.RandomKullanici;
import com.example.demo.service.KullaniciService;


import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class KullaniciController {

	@Autowired
	private final KullaniciService kullaniciService;
	
	@GetMapping("/register")
	public String register(Model model) {
		String string = "register";
		MainKullanici mainKullanici = new MainKullanici();
		model.addAttribute("kullanici",mainKullanici);
		kullaniciService.logControllerMain(string, "Request", mainKullanici);
		return "register";
	}
	@PostMapping("/register")
	public String registerKullanici(@ModelAttribute("kullanici") MainKullanici mainKullanici) {
		String string = "register";
		System.out.println(mainKullanici);
		kullaniciService.registerKullanici(mainKullanici);
		System.out.println(kullaniciService);
		kullaniciService.logControllerMain(string, "Post", mainKullanici);
		return "register";
	}
	
	
	@RequestMapping("/adminPanel")
	public String gettingAdminPanel() {
		String string = "AdminPanel";
		kullaniciService.logControllerMainRandom(string,"Request");
		return string;
	}
	@GetMapping("/adminPanel")
	public String showKullanicilar(Model model) {
		String string = "AdminPanel";
			List<MainKullanici> kullaniciList = kullaniciService.getKullanici();
			//System.out.println(kullaniciList.get(1).getKullaniciID());
			//System.out.println((kullaniciList.get(0).getKullaniciID()).getClass().getSimpleName());
			model.addAttribute("kullanicilar", kullaniciList);
			kullaniciService.logControllerMainRandom(string,"Get");
			return string;
	}
	
	
	@RequestMapping("/adminPanel/add")
	public String gettingAdminPanelAdd() {
		String string = "AdminPanelAdd";
		kullaniciService.logControllerMain(string, "Request", null);
		return string;
	}
	@GetMapping("/adminPanel/add")
	public String adminPanelAdd(Model model) {
		String string = "AdminPanelAdd";
		MainKullanici mainKullanici = new MainKullanici();
		model.addAttribute("kullanici",mainKullanici);
		kullaniciService.logControllerMain(string, "Get", mainKullanici);
		return string;
	}
	@PostMapping("/adminPanel/add")
	public String adminPanelEditKullanici(@ModelAttribute("kullanici") MainKullanici mainKullanici) {
		String string = "AdminPanelAdd";
		System.out.println(mainKullanici);
		kullaniciService.adminPanelAddKullanici(mainKullanici);
		System.out.println(kullaniciService);
		kullaniciService.logControllerMain(string, "Post", mainKullanici);
		return string;
	}
	
	
	@RequestMapping("/adminPanel/find")
	public String gettingAdminPanelFind() {
		String string = "AdminPanelFind";
		kullaniciService.logControllerMain(string, "Request", null);
		return string;
	}
	
	@GetMapping("/adminPanel/find")
	public String adminPanelFind(Model model) {
		String string = "AdminPanelFind";
		long id1 = 35;
		List<MainKullanici> kullaniciList = kullaniciService.getKullanici();
		MainKullanici mainKullanici = new MainKullanici();
		for(int i = 0 ;i < kullaniciList.size();i++) {
			System.out.println(i + " " + kullaniciList.get(i).getKullaniciID());
			if((kullaniciList.get(i).getKullaniciID()).equals(id1)) {
				mainKullanici = kullaniciList.get(i);
			}
		}
		System.out.println(mainKullanici);
		model.addAttribute("kullanici", mainKullanici);
		kullaniciService.logControllerMain(string, "Get", mainKullanici);
		return string;
	}
	@PostMapping("/adminPanel/find")
	public String adminPanelFind(@ModelAttribute("kullanici") MainKullanici findMainKullanici,Model model) {
		String string = "AdminPanelFind";
		MainKullanici mainKullanici = kullaniciService.getByIDKullanici(findMainKullanici.getKullaniciID());
		model.addAttribute("kullanici",mainKullanici);
		kullaniciService.logControllerMain(string, "Post", mainKullanici);
		return string;
	}
	
	
	@RequestMapping("/adminPanel/edit")
	public String gettingAdminPanelEdit() {
		String string = "AdminPanelEdit";
		kullaniciService.logControllerMain(string, "Request", null);
		return string;
	}
	@GetMapping("/adminPanel/edit")
	public String adminPanelEdit(Model model) {
		String string = "AdminPanelEdit";
		long id1 = 35;
		List<MainKullanici> kullaniciList = kullaniciService.getKullanici();
		MainKullanici mainKullanici = new MainKullanici();
		for(int i = 0 ;i < kullaniciList.size();i++) {
			//System.out.println(i + " " + kullaniciList.get(i).getKullaniciID());
			if((kullaniciList.get(i).getKullaniciID()).equals(id1)) {
				mainKullanici = kullaniciList.get(i);
			}
		}
		model.addAttribute("kullanici", mainKullanici);
		kullaniciService.logControllerMain(string, "Get", mainKullanici);
		return string;
	}
	@PostMapping("/adminPanel/edit")
	public String adminPanelEdit(@ModelAttribute("kullanici") MainKullanici mainKullaniciEdit,Model model) {
		String string = "AdminPanelEdit";
		System.out.println(mainKullaniciEdit.getKullaniciID());
		MainKullanici mainKullanici = kullaniciService.updateKullanici(mainKullaniciEdit.getKullaniciID(),mainKullaniciEdit);
		model.addAttribute("kullanici",mainKullanici);
		kullaniciService.logControllerMain(string, "Post", mainKullanici);
		return string;
	}
	
	
	@RequestMapping("/adminPanel/delete")
	public String gettingAdminPanelDelete() {
		String string = "AdminPanelDelete";
		kullaniciService.logControllerMain(string, "Request", null);
		return string;
	}
	@GetMapping("/adminPanel/delete")
	public String adminPanelDelete(Model model) {
		String string = "AdminPanelDelete";
		long id1 = 35;
		List<MainKullanici> kullaniciList = kullaniciService.getKullanici();
		MainKullanici mainKullanici = new MainKullanici();
		for(int i = 0 ;i < kullaniciList.size();i++) {
			//System.out.println(i + " " + kullaniciList.get(i).getKullaniciID());
			if((kullaniciList.get(i).getKullaniciID()).equals(id1)) {
				mainKullanici = kullaniciList.get(i);
			}
		}
		model.addAttribute("kullanici", mainKullanici);
		kullaniciService.logControllerMain(string, "Get", mainKullanici);
		return string;
	}
	@PostMapping("/adminPanel/delete")
	public String adminPanelDelete(@ModelAttribute("kullanici") MainKullanici mainKullaniciEdit,Model model) {
		String string = "AdminPanelDelete";
		System.out.println(mainKullaniciEdit.getKullaniciID());
		kullaniciService.deleteKullanici(mainKullaniciEdit.getKullaniciID());
		kullaniciService.logControllerMain(string, "Post", mainKullaniciEdit);
		return string;
	}
	
	
	@RequestMapping("/adminPanel/randomKullanici")
	public String gettingAdminPanelRandomKullanici() {
		String string = "AdminPanelRandomKullanici";
		kullaniciService.logControllerRandom(string, "Request", null);
		return string;
	}
	@GetMapping("/adminPanel/randomKullanici")
	public String adminPanelRandomKullanici(Model model) {
		String string = "AdminPanelRandomKullanici";
		RandomKullanici randomKullanici = new RandomKullanici();
		model.addAttribute("kullanici",randomKullanici);
		kullaniciService.logControllerRandom(string, "Get", randomKullanici);
		return string;
	}
	@PostMapping("/adminPanel/randomKullanici")
	public String adminPanelRandomKullanici(@ModelAttribute("kullanici") RandomKullanici randomKullanici) {
		String string = "AdminPanelRandomKullanici";
		System.out.println(randomKullanici);
		for(int i = 0; i < randomKullanici.getRandomKullaniciSayisi() ; i++) {
			MainKullanici mainKullanici = new MainKullanici();
			kullaniciService.createRandomMainKullanici(mainKullanici);
			System.out.println("random Sayisi:" + i);
		}
		kullaniciService.adminPanelRandomKullanici(randomKullanici);
		System.out.println(kullaniciService);
		kullaniciService.logControllerRandom(string, "Post", randomKullanici);
		return string;
	}
	
	
	@RequestMapping("/adminPanel/log")
	public String gettingAdminPanelLog() {
		String string = "AdminPanelLog";
		kullaniciService.logControllerMainRandom(string, "Request");
		return string;
	}
	@GetMapping("/adminPanel/log")
	public String showLogKullanicilar(Model model) {
		String string = "AdminPanelLog";
			List<LogKullanici> logList = kullaniciService.getLog();
			//System.out.println(logList.get(0).getLogID());
			model.addAttribute("logKullanicilar", logList);
			kullaniciService.logControllerMainRandom(string, "Get");
		return string;
	}
}
