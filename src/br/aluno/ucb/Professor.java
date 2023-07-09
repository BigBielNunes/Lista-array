package br.aluno.ucb;

import java.util.List;

public class Professor extends Pessoa{
	private String titulacao;
	private double salario;
	List<Curso> cursos;
	public Professor(String nome, String cpf, String email, List<Telefone> telefones, Endereco endereco,
			String titulacao, double salario, List<Curso> cursos) {
		super(nome, cpf, email, telefones, endereco);
		this.titulacao = titulacao;
		this.salario = salario;
		this.cursos = cursos;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
}
