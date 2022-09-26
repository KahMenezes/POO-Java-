package Aula03;

import java.util.Scanner;

/* 25. Faça um algoritmo para receber um número qualquer e informar na tela se é 
par ou ímpar. Utilize o operador %. */


public class Ex25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um número: ");
		num = ler.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("O número é par! ");
		}else {
			System.out.printf("O número é ímpar! ");
		}
		
		ler.close();
	}

}
