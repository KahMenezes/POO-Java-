package Aula03;

import java.util.Scanner;

/*15. A partir de três valores que serão digitados, verificar se formam ou não
 um triângulo. Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou equilátero”.
 Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e o 
 equilátero, todos os lados iguais. Para existir triângulo é necessário que a soma de dois lados 
 quaisquer seja maior que o outro, isto, para os três lados.*/

public class Ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int L1, L2, L3;
		
		System.out.printf("Digite o valor do 1º lado do triângulo: ");
		L1 = ler.nextInt();
		
		System.out.printf("Digite o valor do 2º lado do triângulo: ");
		L2 = ler.nextInt();
		
		System.out.printf("Digite o valor do 3º lado do triângulo: ");
		L3 = ler.nextInt();
		
		if (L1 < (L2 + L3) && L2 < (L1 + L3) && L3 < (L1 + L2)) {
			if (L1 == L2 && L1 == L3){
				System.out.println("Três lados iguais. Formam um Triângulo Equilatero");
			}else if(L1 == L2 || L1 == L3){
				System.out.println("Dois lados iguais. Formam um Triângulo Isosceles");
			}else {
				System.out.println("Três lados diferentes. Formam um Triângulo Escaleno");
			}					
		} else {
			System.out.println("As medidas fornecidas não formam um triângulo");
		}
		
	}
	
}
