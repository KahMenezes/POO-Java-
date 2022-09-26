package Aula02;

import java.util.Scanner;

	public class Ex03 {

		public static void main(String[] args) {

			/*3. A partir dos valores da base e altura de um triângulo,
			calcular e exibir sua área.*/
			
			Scanner ler = new Scanner (System.in);
			
			double alt, base, area;
			
			System.out.printf("Informe a altura do triângulo:");
			alt = ler.nextDouble();
			
			System.out.printf("Informe a base do triângulo:");
			base = ler.nextDouble();
			
			area = (base * alt) / 2;
			
			System.out.printf("A área do triângulo é: %.2f\n", area);
			
		}

	}