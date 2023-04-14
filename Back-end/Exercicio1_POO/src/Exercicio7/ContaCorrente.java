package Exercicio7;

public class ContaCorrente {
	private float saldo;

	public ContaCorrente() {
		this.saldo = 0;
	}

	public void depositar(float valor) {
		this.saldo += valor;

		System.out.println("Após o depósito de " + valor + "R$, o saldo atual da conta é: " + this.saldo);
	}

	public void sacar(float valor) {
		if (valor > this.saldo) {
			System.out.println("O valor passado é maior do que o saldo em conta!");
		} else {
			this.saldo -= valor;
			System.out.println("Após o saque de " + valor + "R$, o saldo atual da conta é: " + this.saldo);
		}
	}

	public void saldoEmConta() {
		System.out.println("\nO saldo atual da conta é: " + this.saldo); 
	}
}
