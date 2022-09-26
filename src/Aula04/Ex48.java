package Aula04;

import java.util.Scanner;

/* 48. Crie um programa em que o usuário entre com um número inteiro qualquer, 
 e o programa imprima os 20 números subsequentes ao que foi digitado pelo usuário*/

public class Ex48 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Insira um número: ");
		int n = ler.nextInt();
		
		for(int x = 1; x < 21; x++) {
			
			System.out.printf("%d\n", n+x);
			
		}
		
	}

}