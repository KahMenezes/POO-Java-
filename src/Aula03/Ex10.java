package Aula03;

import java.util.Scanner;

/*10. Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário, enviar mensagem avisando que os números são idênticos.
 */

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.printf("Digite o 1º número: ");
		n1 = ler.nextInt();
		
		System.out.printf("Digite o 2º número: ");
		n2 = ler.nextInt();
		
		if (n1 > n2) {
			System.out.printf("O número %d é maior que %d", n1, n2);
		}else if (n1 < n2) {
			System.out.printf("O número %d é maior que %d", n2, n1);					
		}else if (n1 == n2) {
			System.out.printf("Os números sao idênticos");		
		}
		
	}
}
