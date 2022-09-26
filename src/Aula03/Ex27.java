package Aula03;

import java.util.Scanner;

/* 27. Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 
caso seja ímpar, imprimir o resultado desta operação.*/

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, resultado;
		
		System.out.printf("Digite um numero: ");
		num = ler.nextInt();
		
		if(num % 2 == 0) {
			resultado = num + 5;
			System.out.printf("Resultado: %d", resultado);
		}else {
			resultado = num + 8;
			System.out.printf("Resultado: %d", resultado);
		}
		
		ler.close();
	}

}
