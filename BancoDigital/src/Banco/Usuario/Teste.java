package Banco.Usuario;

import Banco.Banco;
import Banco.Cliente;
import Banco.Conta.Conta;
import Banco.Conta.ContaCorrente;
import Banco.Conta.ContaPoupanca;

public class Teste {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Matheus Borges", "123.456.789-00", "(11)94002-8922" );
		
		Conta cc = new ContaCorrente(c1);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(c1);
		
		cc.transferir(100, poupanca);
		
		Banco banco = new Banco("Banco Digital");
		banco.adicionarConta(cc);
		banco.adicionarConta(poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		Cliente c2 = new Cliente("João Silva", "987.654.321-00", "(11)90000-0001" );
		
		Conta cc2 = new ContaCorrente(c2);
		cc2.depositar(50000);
		cc2.sacar(200);
		
		banco.adicionarConta(cc2);
		
		cc2.imprimirExtrato();
		
		Cliente c3 = new Cliente("Pé de Pano", "963.852.741-00", "(11)99999-9999" );
		
		Conta cc3 = new ContaCorrente(c3);
		cc3.sacar(200);
		
		banco.adicionarConta(cc3);
		
		cc3.imprimirExtrato();
		
	}

}
