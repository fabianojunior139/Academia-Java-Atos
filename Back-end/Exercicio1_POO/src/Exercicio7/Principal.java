package Exercicio7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();

		Scanner scan = new Scanner(System.in);

		char option = 's';

		while (option == 's' || option == 'S') {
			System.out.println("\n-----------------------");
			System.out.println("Bem-vindo a sua conta!");
			System.out.println("-----------------------\n");
			System.out.print("Digite 1 para depositar, 2 para sacar, 3 parar verificar o saldo e 4 para sair: ");
			int escolha = scan.nextInt();

			float valor;

			switch (escolha) {
			case 1:
				System.out.print("Qual é o valor que você quer depositar? : ");
				valor = scan.nextFloat();
				conta.depositar(valor);
				break;

			case 2:
				System.out.print("Qual é o valor que você quer sacar? : ");
				valor = scan.nextFloat();
				conta.sacar(valor);
				break;

			case 3:
				conta.saldoEmConta();
				break;

			case 4:
				System.out.println("\nVolte sempre!");
				option = scan.next().charAt(0);

			default:
				System.out.println("Opção inválida! tente novamente");
				break;
			}
		}

		scan.close();
	}

}
