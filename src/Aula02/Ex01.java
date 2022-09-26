package Aula02;

import java.util.Scanner;

		public class Ex01 {

			public static void main(String[] args) {
				
		      /*1. Entrar via teclado com a base e a altura de um retângulo, 
				calcular e exibir sua área.*/
				
				Scanner ler = new Scanner (System.in);
				
				double a, b, area;
				
				System.out.printf("Informe a altura do retângulo:");
				a= ler.nextDouble();
				
				System.out.printf("Informe a base do retângulo:");
				b= ler.nextDouble();
				
				area = a * b;
				
				System.out.printf("A área do retângulo é: %.2f\n",area);
						
			}

	}


