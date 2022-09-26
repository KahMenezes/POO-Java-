package Aula04;

import java.util.Scanner;

/* 31. Criar uma rotina de entrada que aceite somente um valor positivo. */

public class Ex31 {

	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	   
	    int num;
	   
	    System.out.printf("Digite um número positivo: ");
	    num = ler.nextInt();
	   
	    while(num <= 0) {
	        System.out.printf("Erro, número negativo! Digite um número positivo: ");
	        num = ler.nextInt();
	    }

	    System.out.printf("Você digitou o número positivo: %d", num);
	    
		ler.close();
		
	}

}