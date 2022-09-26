package Aula03;

import java.util.Scanner;

/* 22. Exibir o seguinte seletor de opções e em função de uma escolha, 
 solicitar os dados necessários para o cálculo da respectiva área. 
 Enviar mensagem de erro se o usuário escolher uma opção inexistente.
 Encerrar o programa somente quando selecionada a opção de finalização. 
 (Fazer esse exercício utilizando If..Else e/ou Case)
 1 – Triângulo
 2 – Quadrado
 3 – Retângulo
 4 – Círculo
 5 – Fim de processo*/

public class Ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int opc;
		double base, altura, raio, area;
		
		do {
			
			System.out.println("Menu de Opções:");
			System.out.println("Opção 1 - Área de um triângulo.");
			System.out.println("Opção 2 - Área de um quadrado.");
			System.out.println("Opção 3 - Área de um retângulo.");
			System.out.println("Opção 4 - Area de circulo.");
			System.out.println("Opção 5 - Finalizar processo.");
			System.out.printf("Digite a opção desejada: ");
			opc = ler.nextInt();
			
			switch(opc) {
				case 1:
					
					System.out.printf("Digite o tamanho da base do triângulo: ");
					base = ler.nextDouble();					
					System.out.printf("Digite o tamanho da altura do triângulo: ");
					altura = ler.nextDouble();
					area = ( base * altura ) / 2;
					System.out.printf("A área do triângulo e igual a: %.2f.\n", area);
					break;
					
				case 2:
					
					System.out.printf("Digite o tamanho da aresta do quadrado: ");
					base = ler.nextDouble();	
					area = base * base;
					System.out.printf("A área do quadrado é igual a: %.2f.\n", area);
					break;
					
				case 3:
					
					System.out.printf("Digite o tamanho da base do retângulo: ");
					base = ler.nextDouble();
					System.out.printf("Digite o tamanho da altura do retângulo: ");
					altura = ler.nextDouble();
					area = base * altura;
					System.out.printf("A área do retângulo é igual a: %.2f.\n", area);
					break;
					
				case 4:
					
					System.out.printf("Digite o tamanho do raio do círculo: ");
					raio = ler.nextDouble();			
					area = 3.14 * ( raio * raio );
					System.out.printf("A área do circulo é igual a: %.2f.\n", area);
					break;
					
				case 5:
					
					System.out.println("Saindo do Sistema...");
					System.exit(0);
					break;

				default:
					
					System.out.printf("Opção inválida. Digite outra opção.\n");
					
			}
			
		}while(opc!=5);
		
		ler.close();
	}
	
}
