package br.aluno.ucb;

import java.util.List;

public class Aluno extends Pessoa{
	Curso curso;
	List<Double> notas;
	public Aluno(String nome, String cpf, String email, List<Telefone> telefones, Endereco endereco, Curso curso,
			List<Double> notas) {
		super(nome, cpf, email, telefones, endereco);
		this.curso = curso;
		this.notas = notas;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public List<Double> getNotas() {
		return notas;
	}
	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
}
