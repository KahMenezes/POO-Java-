package Aula03;

import java.util.Scanner;

//13. Entrar via teclado com três valores distintos. Exibir o maior deles.

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3, aux;
		aux = 0;
		System.out.printf("Digite o 1º número: ");
		n1 = ler.nextInt();
		
		System.out.printf("Digite o 2º número: ");
		n2 = ler.nextInt();
		
		System.out.printf("Digite o 3º número: ");
		n3 = ler.nextInt();
		
		if (n1 > n2) {
			aux = n1;
		}else if (n1 < n2) {
			aux = n2;	
		}
		if (aux > n3) {
			System.out.printf("O maior número é: %d", aux);
		}else {
			System.out.printf("O maior número é: %d", n3);
		}
		
	}
}

