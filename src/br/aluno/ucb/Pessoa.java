package br.aluno.ucb;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private String cpf;
	private String email;
	List<Telefone> telefones = new ArrayList<>();
	Endereco endereco;
	public Pessoa(String nome, String cpf, String email, List<Telefone> telefones, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefones = telefones;
		this.endereco = endereco;
		telefones.add(new Telefone("apple","61","99999999"));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void imprimir(){
		
	}
}	
