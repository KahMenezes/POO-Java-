package Aula03;

import java.util.Scanner;

/* 29. Escreva um algoritmo que leia três valores inteiros e diferentes e 
mostre-os em ordem decrescente.*/

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite um valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite um valor: ");
		b = ler.nextInt();
		
		System.out.printf("Digite um valor: ");
		c = ler.nextInt();
		
		if(a > b) {
			if(b > c) {
				System.out.printf("Ordem Decrescente: %d, %d, %d.", a, b, c);
			}else {
				System.out.printf("Ordem Decrescente: %d, %d, %d.", a, c, b);
			}
		}else {
			if(a > c) {
				System.out.printf("Ordem Decrescente: %d, %d, %d.", b, a, c);
			}else{
				System.out.printf("Ordem Decrescente: %d, %d, %d.", b, c, a);
			}
		}
		
		ler.close();

	}
}
