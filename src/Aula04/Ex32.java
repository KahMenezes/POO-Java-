package Aula04;

import java.util.Scanner;

/* 32. Entrar com dois valores via teclado, onde o segundo deverá ser maior 
 que o primeiro. Caso contrário solicitar novamente apenas o segundo valor. */

public class Ex32 {

	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	   
	    int num1, num2;
	   
	    System.out.printf("Digite o 1º número: ");
	    num1 = ler.nextInt();

	    System.out.printf("Digite o 2º número: ");
	    num2 = ler.nextInt();
	   
	    while(num1 > num2) {
	        System.out.printf("O 2º número deve ser maior que o 1º, tente novamente: ");
	        num2 = ler.nextInt();
	    }

	    System.out.printf("O número %d é maior que %d", num2, num1);
	    
	    ler.close();
	    
	}

}
