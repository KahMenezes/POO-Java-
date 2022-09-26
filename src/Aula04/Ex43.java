package Aula04;

import java.util.Scanner;

/* 43. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. 
 O valor “N” será digitado, deverá ser positivo, mas menor que cinqüenta. 
 Caso o valor não satisfaça a restrição, enviar mensagem de erro 
 e solicitar o valor novamente.*/
 
public class Ex43 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		float soma = 0, p1 = 1;
		
		do {
		System.out.printf("Informe o tamanho da sequência (1 >= n < 50): ");
		num = ler.nextInt();
		
		}while(num < 1 || num > 49);
		
		for(int x = 0; x < num; x++) {
		
			p1 += 2 * x + 1;
			soma += p1 / Math.pow((x + 1), 3);
			
		}
		
		System.out.printf("A soma dos primerios %d números da sequência e: %.2f", num, soma);
	}
}
