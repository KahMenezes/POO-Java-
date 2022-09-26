package Aula03;

import java.util.Scanner;

/* 21. Entrar via teclado com dois valores quaisquer. Após a digitação, 
exibir um seletor de opções (“menu”) com as seguintes opções: 
(Fazer esse exercício utilizando If..Else e/ou Case)
1 – Multiplicação
2 – Adição
3 – Divisão
4 – Subtração
5 – Fim de processo (sair do programa)
Solicitar uma opção por parte do usuário, verificar se é ou não uma opção válida
(letras ou números) e processar a respectiva operação. Enviar mensagem de erro se 
a opção escolhida não existir no seletor.
Encerrar o programa somente quando o usuário escolher a opção de finalização. 
Repare que a opção de número três é de divisão e o programa deverá enviar mensagem de erro, 
(somente nesta opção) se o denominador for zero.*/

public class Ex21 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int opc;
		double n1, n2, vOperacao;
		
		do {
			System.out.printf("Digite o primeiro valor: ");
			n1 = ler.nextDouble();
			
			System.out.printf("Digite segundo valor: ");
			n2 = ler.nextDouble();
			
			System.out.printf("Menu de Opcoes:\n");
			System.out.printf("Opcao 1 - Multiplicacao.\n");
			System.out.printf("Opcao 2 - Adicao.\n");
			System.out.printf("Opcao 3 - Divisao.\n");
			System.out.printf("Opcao 4 - Subtracao.\n");
			System.out.printf("Opcao 5 - Sair do programa.\n");
			System.out.printf("Digite a opcao desejada: ");
			opc = ler.nextInt();
			
			switch(opc) {
				case 1:					
					vOperacao = n1 * n2;
					System.out.printf("O Resultado da Multiplicacao entre: %.2f e %.2f =  %.2f.\n", n1, n2, vOperacao);
					break;
					
				case 2:					
					vOperacao = n1 + n2;
					System.out.printf("O Resultado da Soma entre: %.2f e %.2f = %.2f.\n", n1, n2, vOperacao);
					break;
					
				case 3: 					
					if(n2==0) {
						System.out.printf("ERRO! - Para executar uma divisao o segundo valor deve ser diferente de 0.\n");
						break;
					}
					
					vOperacao = n1/n2;
					System.out.printf("O resultado da divisao entre: %.2f e %.2f resulta em: %.2f.\n", n1, n2, vOperacao);
					break;
					
				case 4:
					
					vOperacao = n1 - n2;
					System.out.printf("O resultado da subtracao entre: %.2f e %.2f resulta em: %.2f.\n", n1, n2, vOperacao);
					break;
					
				case 5:
					System.out.printf("Saindo do Sistema.\n");
					System.exit(0);					
					break;
					
				default:
					
					System.out.printf("Opcao invalida. Digite outra opcao.\n");
			}
			
		}while( opc != 5 );
		
		ler.close();

	}
}
