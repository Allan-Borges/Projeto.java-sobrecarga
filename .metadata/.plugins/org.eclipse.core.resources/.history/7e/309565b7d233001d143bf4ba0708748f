package applicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Conta conta = new Conta();
		
		System.out.print("Entre com o número da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Entre com o nome: ");
		String nome = sc.nextLine();		
		System.out.print("Deseja fazer um deposito inicial(s/n)?");
		char opcao = sc.next().charAt(0);
		double deposito = 0.0;
		
		if(opcao == 's') {
			System.out.print("Entre com o deposito inicial: ");
			deposito = sc.nextDouble();
			conta = new Conta(numero, nome, deposito);
			
		}else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		System.out.println();
		System.out.print("Entre com o valor do deposito: ");
		deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println();
		System.out.println("Dados atulizados: ");
		System.out.println(conta);
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double saque = sc.nextDouble();
		System.out.println();
		conta.saque(saque);
		System.out.println("Dados atulizados: ");
		System.out.println(conta);
		
		sc.close();
	}
}
