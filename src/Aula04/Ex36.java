package Aula04;

import java.util.Scanner;

/* 36. Entrar via teclado com um valor (X) qualquer. Travar a digitação, 
 no sentido de aceitar somente valores positivos. Solicitar o intervalo 
 que o programa que deverá calcular a tabuada do valor digitado, 
 sendo que o segundo valor (B), deverá ser maior que o primeiro (A), 
 caso contrário, digitar novamente somente o segundo. Após a validação 
 dos dados, exibir a tabuada do valor digitado, no intervalo decrescente, 
 ou seja, a tabuada de X no intervalo de B para A.*/

public class Ex36 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, a, b;
		
		do {
			System.out.printf("Digite um número positivo: ");
			x = ler.nextInt();
		}
		while(x <= 0);
		
		System.out.printf("Digite o 1º numero: ");
		a = ler.nextInt();
		
		do {
			System.out.printf("Digite o 2º número maior que é o 1º: ");
			b = ler.nextInt();
		}
		while(b <= a);
		
		for(; b >= a; b--) {
			System.out.printf("\n%d X %d = %d", b, x, (b * x));
		}

	}

}