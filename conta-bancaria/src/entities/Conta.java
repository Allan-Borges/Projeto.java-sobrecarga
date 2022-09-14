package entities;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		
	}

	public Conta(int conta, String nome, double depositoInicial) {
		this.numero = conta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public int getConta() {
		return numero;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		 this.saldo+= valor;
	}
	
	public void saque(double valor) {
		this.saldo -=  valor + 5;
}
	public String toString() {
		return "Conta " 
			+ numero 
			+ ", Nome: "
			+ nome
			+ ", Saldo: R$"
			+ String.format("%.2f",saldo);
	}
}
