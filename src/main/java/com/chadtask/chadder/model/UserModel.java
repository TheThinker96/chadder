package com.chadtask.chadder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Email varchar(60) primary key,
//Password varchar(30),
//Nom varchar(30), 
//Prenom varchar(60), 
//NumeroImage Int

@Entity
@Table(name="User")
public class UserModel {
	@Id
	@Column(name="email", nullable = false)
	private String Email;
	
	@Column(name="email", nullable = false)
	private String Password;
	
	@Column(name="email", nullable = false)
	private String Nom;
	
	@Column(name="email", nullable = false)
	private String Prenom;
	
	@Column(name="numero_image", nullable = false)
	private String numero_image;
	public UserModel(String email, String password, String nom, String prenom, String numero_image) {
		super();
		Email = email;
		Password = password;
		Nom = nom;
		Prenom = prenom;
		this.numero_image = numero_image;
	}
	public UserModel() {
		super();
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getNumero_image() {
		return numero_image;
	}
	public void setNumero_image(String numero_image) {
		this.numero_image = numero_image;
	}
	@Override
	public String toString() {
		return "UserModel [Email=" + Email + ", Password=" + Password + ", Nom=" + Nom + ", Prenom=" + Prenom
				+ ", numero_image=" + numero_image + "]";
	}
	
	

}
