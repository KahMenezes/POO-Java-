package Aula03;

import java.util.Scanner;

/*8. Entrar via teclado, com dois valores distintos. Exibir o maior deles.*/

public class Ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.printf("Digite o 1º número: ");
		n1 = ler.nextInt();
		
		System.out.printf("Digite o 2º número: ");
		n2 = ler.nextInt();
		
		if (n1 > n2) {
			
			System.out.printf("O número %d é maior que %d", n1, n2);
			
		}
		else {
			System.out.printf("O número %d é maior que %d", n2, n1);		
		}

	}
}
