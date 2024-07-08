package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exception.Erros;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite os dados do usuário: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Conta: ");
		int conta = sc.nextInt();
		sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limite = sc.nextDouble();
		
		Conta acc = new Conta(nome, conta, saldo, limite);
		
		System.out.println();
		System.out.print("Informe a quantia de saque: ");
		double quantia = sc.nextDouble();
		
		
		try {
			acc.saque(quantia);
			System.out.printf("Novo saldo: %.2f\n", acc.getSaldo());
		}
		catch (Erros e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}

}
