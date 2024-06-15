package Banco;

import java.util.ArrayList;
import java.util.List;

import Banco.Conta.Conta;

public class Banco {
	
	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public Conta buscarConta(int numero) {
		for(Conta conta : contas) {
			if(conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}
	
}
