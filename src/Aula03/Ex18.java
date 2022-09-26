package Aula03;

import java.util.Scanner;

/* 18. Criar um programa para analisar a velocidade de um automóvel. 
 Solicitar via teclado os valores da aceleração (a em m/s2), 
 velocidade inicial (v0 em m/s) e o tempo de percurso (t em s). 
 Calcular e exibir a velocidade final do automóvel em km/h. 
 E exibir mensagem de acordo com a tabela do exercício:*/

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double acel,vini,tempo,vfim,kmh; 
		
		System.out.printf("Digite a aceleracao que estava o carro: ");
		acel = ler.nextDouble();
		
		System.out.printf("Digite a velocidade inicial em que estava o carro: ");
		vini = ler.nextDouble();
		
		System.out.printf("Digite o tempo que o percurso foi feito: ");
		tempo= ler.nextDouble();
		
		vfim = vini + (acel * tempo);
		
		System.out.printf("Velocidade final = %.2f m/s.\n", vfim);
		
		kmh = vfim * 3.6;
		
		if(kmh<=40) {

			System.out.printf("Veiculo a km/h = %.2f, Veiculo muito Lento.\n", kmh);

		}else if(kmh<=60) {
			
			System.out.printf("Veiculo a km/h = %.2f, Velocidade permitida.\n", kmh);
		}else if(kmh<=80) {

			System.out.printf("Veiculo a km/h = %.2f, Velocidade de cruzeiro.\n", kmh);
			
		}else if(kmh<=120) {
			
			System.out.printf("Veiculo a km/h = %.2f, Veiculo rápido.\n", kmh);

		}else {
			
			System.out.printf("Velocidade em km/h = %.2f, Veiculo muito rápido.\n", kmh);
			
		}
		
		ler.close();
	}
}

