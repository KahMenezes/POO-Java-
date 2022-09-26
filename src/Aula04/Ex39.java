package Aula04;

/* 39. Exibir os trinta primeiros valores da série de Fibonacci. 
A série: 1, 1, 2, 3, 5, 8, ...*/

public class Ex39 {

	public static void main(String[] args) {
		int soma = 0, num1 = 1, num2 = 0;
		
		System.out.printf("Primeiros 30 números da Sequência de Finonacci.\n ");
		
		for(int i = 0; i < 30; i++) {
			
			soma = num1 + num2;
			System.out.printf("\n%d", num1);
			num2 = num1;
			num1 = soma;

		}

	}
}