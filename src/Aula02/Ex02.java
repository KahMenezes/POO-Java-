package Aula02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/* 2. Calcular e exibir a área de um quadrado,
		a partir do valor de sua aresta que será digitado.*/
		
		Scanner ler = new Scanner (System.in);
		
		double l, area;
		
		System.out.printf("Informe um dos lados do quadrado:");
		l = ler.nextDouble();
		
		area = l * l;
		
		System.out.printf("A área do quadrado é: %.2f\n", area);
	
	
	
	}

}