package Aula04;

import java.util.Scanner;

/* 37. Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. 
 Entre as tabuadas, solicitar que o usuário pressione uma tecla.*/

public class Ex37 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int x,y;
		
		for(x = 1; x <= 20; x++) {
			System.out.printf("\nTabuada do %d", x);
			for(y = 1; y <= 10; y++) {
				System.out.printf("\n%d X %d = %d", y, x, (y * x));
			}
			System.out.println("\n Aperte Enter para continuar");
			ler.nextLine();

		}
		 
	}

}
