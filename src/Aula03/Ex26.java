package Aula03;

import java.util.Scanner;

/* 26. Encontrar o dobro de um número caso ele seja positivo e o seu triplo 
 caso seja negativo, imprimindo o resultado.*/

public class Ex26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, resultado;
		
		System.out.printf("Digite um valor: ");
		num = ler.nextInt();
		
		if(num < 0) {
			resultado = num * 3;
			System.out.printf("Resultado: %d", resultado);
		}else {
			resultado = num * 2;
			System.out.printf("Resultado: %d", resultado);
		}
		
		ler.close();

	}

}

