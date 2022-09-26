package Aula02;

import java.util.Scanner;

/*5. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular
e exibir sua temperatura equivalente em Fahrenheit.*/


public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double grcelsius, grfahrenheit;
		
		System.out.printf("Informe a temperatura em graus Celsius: ");
		grcelsius = ler.nextDouble();

		grfahrenheit = (grcelsius * 1.8) + 32;
		
		System.out.printf("%.1f Graus Celsius é equivale a %.1f em Fahrenheit\n", grcelsius, grfahrenheit);

	}
}

