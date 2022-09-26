package Aula04;

import java.util.Scanner;

/* 35. Entrar via teclado com um valor qualquer. Travar a digitação, 
no sentido de aceitar somente valores positivos. Após a digitação, 
exibir a tabuada do valor solicitado, no intervalo de um a dez.*/

public class Ex35 {

	public static void main(String[] args) {
		
	     Scanner ler = new Scanner(System.in);
			
		int a,x;
		
		do{	
		
			System.out.printf("Digite um número positivo.");
			a = ler.nextInt();
		
		}while(a<0);
		
		System.out.printf("Tabuada do %d",a);
		
		for(x = 1; x <= 10; x++) {			
			System.out.printf("\n %d X %d = %d", x , a, (a * x));
		}

	}

}

