package model.entities;

import model.exception.Erros;

public class Conta {

	private String nome;
	private int numero;
	private double saldo;
	private double limite;
	
	public Conta() {
		
	}

	public Conta(String nome, int numero, double saldo, double limite) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public void deposito(Double quantia) {
		saldo += quantia;
	}
	
	public void saque(Double quantia) {
		validaSaque(quantia);
		saldo -= quantia;
	}
	
	private void validaSaque(double quantia) {
		if (quantia > getLimite()) {
			throw new Erros("Erro: A quantia excede o limite de saque!");
		}
		if (quantia > getSaldo()) {
			throw new Erros("Erro: Saldo insuficiente!");
		}
	}
}
