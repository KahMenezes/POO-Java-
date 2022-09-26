package Aula04;

import java.util.Scanner;

/* 49. Crie um programa que solicite que o usuário entre com dois números 
 (inicial e final). Ao final o programa deverá apresentar o valor total 
 da soma de todos os números do intervalo digitado pelo usuário*/

public class Ex49 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int soma=0;
		
		System.out.printf("Insira o número inicial: ");
		int nIni = ler.nextInt();
		
		System.out.printf("Insira o número final: ");
		int nFim = ler.nextInt();
		
		while(nFim <= nIni) {
			
			System.out.printf("O número final deve ser maior que o inicial: ");
			nFim = ler.nextInt();
			
		}
		
		for(int x = nIni; x <= nFim; x++)	{
			
			soma+=x;
			
		}
		
		System.out.printf("A soma da sequência de números entre %d e %d e: %d", nIni, nFim, soma);

	}
}
