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
@Table(name = "LogKullaniciTable")
public class LogKullanici {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long logID;
	private String logAciklama;
	
	public Long getLogID() {
		return logID;
	}
	
	public void setLogID(Long logID) {
		this.logID = logID;
	}
	
	public String getLogAciklama() {
		return logAciklama;
	}
	
	public void setLogAciklama(String logAciklama) {
		this.logAciklama = logAciklama;
	}
}
