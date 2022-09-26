package Aula02;

	import java.util.Scanner;

	/*4. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.*/

	public class Ex04 {

		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			double v1, v2, v3, v4, media;
			
			System.out.printf("Informe o primeiro valor: ");
			v1 = ler.nextDouble();

			System.out.printf("Informe o segundo valor: ");
			v2 = ler.nextDouble();

			System.out.printf("Informe o terceiro valor: ");
			v3 = ler.nextDouble();

			System.out.printf("Informe o quarto valor: ");
			v4 = ler.nextDouble();

			media = (v1 + v2 + v3 + v4) / 4;
			
			System.out.printf("A média dos valores é: %.2f, %.2f, %.2f, %.2f e: %.2f\n", v1, v2, v3, v4, media);
			

		}

	}