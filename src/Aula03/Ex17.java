package Aula03;

import java.util.Scanner;

/* 17. Entrar com o peso, o sexo e a altura de uma determinada pessoa. Após a digitação, 
exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².*/ 

public class Ex17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Scanner texto = new Scanner(System.in);
		
		double peso, altura, imc;
		String sexo;
				
		System.out.printf("Digite o seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite a sua altura: ");
		altura = ler.nextDouble();
		
		System.out.printf("Digite o sexo (F ou M): ");
		sexo = texto.next();
		
		imc = peso / (altura * altura);
		
		if (sexo == "F" || sexo == "f") {
			if (imc < 19) {
				
				System.out.printf("Abaixo do peso");
				
				}else if (imc <= 19 || imc < 24) {
					
					System.out.printf("Peso ideal");
					
				}else if (imc >= 24) {
					
					System.out.printf("Acima do peso");
				}
		}else{
			
			if (imc < 20) {
				
				System.out.printf("Abaixo do peso");
				
			}else if (imc <= 20 || imc < 25) {
				
				System.out.printf("Peso ideal");
				
			}else if (imc >= 25) {
				
				System.out.printf("Acima do peso");
				
			}
			
		}
		
		ler.close();
		
		texto.close();
		
	}
	
}
