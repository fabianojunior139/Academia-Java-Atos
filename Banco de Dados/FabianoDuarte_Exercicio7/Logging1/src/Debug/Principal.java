package Debug;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        try (Scanner leitura = new Scanner(System.in)) {

            Log log = new Log("Log.txt");

            log.logger.info("\n\n\nCalculadora iniciada!");

            Calculadora c = new Calculadora();
            float a = 0, b = 0, resultado = 0;

            String operador;
            System.out.println("Calculadora");

            do {
                System.out.println("Insira o operador +, -, *, /");
                operador = leitura.nextLine();

            } while (!(operador.contains("+") || operador.contains("-") || operador.contains("*")
                    || operador.contains("/")));

            log.logger.info("\nOperação " + operador + " foi selecionada!");

            System.out.println("Insira o 1o valor");
            a = leitura.nextFloat();
            System.out.println("Insira o 2o valor");
            b = leitura.nextFloat();

            resultado = c.calcular(a, b, operador.charAt(0));
            if (a > b) {
                System.out.println("O resultado de " + a + " " + operador + " " + b + " é: " + resultado);
            } else {
                System.out.println("O resultado de " + b + " " + operador + " " + a + " é: " + resultado);
            }

            log.logger.info("\nO resultado da operação é: " + resultado + " e a calculadora foi encerrada!");
        }
    }
}

