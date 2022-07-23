package com.expertostech.apirest.tutorialrestapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "usuario") // se não definir um name, por padrão é pego o da classe
public class UsuarioModel {

	@Id
	public Integer codigo;
	
	@Column(nullable = false, length = 20)	//nullable = não pode ser nulo. length = define o tam max
	public String nome;
	
	@Column(nullable = false, length = 20)
	public String login;

	@Column(nullable = false, length = 20)
	public String senha;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
