package Aula03;

import java.util.Scanner;

/* 20. Uma escola com cursos em regime semestral realiza duas avaliações durante o 
 semestre e calcula a média do aluno, da seguinte maneira:
 MEDIA = (P1 + 2.P2) / 3
 Fazer um programa para entrar via teclado com o valor da primeira nota (P1) 
 e o programa deverá calcular e exibir quanto o aluno precisa tirar na segunda nota 
 minimamente (P2) para ser aprovado, sabendo que a média de aprovação é igual a cinco.*/

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media = 5;
		
		System.out.printf("Digite a nota da P1: ");
		nota1 = ler.nextDouble();
		
		nota2= (( 3 * media ) - nota1 ) / 2;
		System.out.printf("O Aluno precisa tirar %.1f na P2 para ser APROVADO.", nota2);
		
		ler.close();
	
	}
}
