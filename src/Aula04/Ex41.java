package Aula04;

import java.util.Scanner;

/* 41. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. 
 O valor “N” será digitado, deverá ser positivo, mas menor que cem. 
 Caso o valor não satisfaça a restrição, enviar mensagem de erro 
 e solicitar o valor novamente.
 A seqüência: 2, 5, 10, 17, 26, ....*/


public class Ex41 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int soma = 0, ln = 2, num = 0, seq = 0;
		
		do {
			System.out.println("\nDigite a quantidade de vezes da repeticao até a soma (0 > N < 100): ");
			num = ler.nextInt();
			
		}while(num >= 100 || num < 1);
		
		for(int x = 0; x < num; x++) {

			seq += ln;
			soma+= seq;
			ln = 3 + 2 * x;
			
		}
		
		System.out.printf("\nA soma dos %d primeiros numeros da sequencia é: %d", num, soma);
	}
}