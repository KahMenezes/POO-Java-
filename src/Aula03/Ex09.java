package Aula03;

import java.util.Scanner;

/*9. Entrar via teclado, com dois valores distintos. Exibir o menor deles.*/

public class Ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.printf("Digite o 1º número: ");
		n1 = ler.nextInt();
		
		System.out.printf("Digite o 2º número: ");
		n2 = ler.nextInt();
		
		if (n1 < n2) {
			
			System.out.printf("O número %d é menor que %d", n1, n2);
			
		}else {
			
			System.out.printf("O número %d é menor que %d", n2, n1);		
		}		
		
	}
}

