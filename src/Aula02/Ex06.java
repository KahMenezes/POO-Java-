package Aula02;

import java.util.Scanner;

/* 6. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. 
 * Calcular e exibir o valor correspondente em Reais (R$).
 */

public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double dolar, qtde, real;
		
		System.out.printf("Informe a cotação do Dólar: ");
		dolar = ler.nextDouble();

		System.out.printf("Informe a quantidade de Dolares: ");
		qtde = ler.nextDouble();

		real = dolar * qtde;
		
		System.out.printf("A quantidade de %.2f Dolares a uma cotação de %.2f equivale a R$ %.2f\n", qtde, dolar, real);
		

	}

}

