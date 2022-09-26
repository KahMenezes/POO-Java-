package Aula03;

import java.util.Scanner;

/* 30. Elabore um algoritmo que calcule o que deve ser pago por um produto, 
 considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
 Utilize os códigos da tabela a seguir para ler qual a condição de pagamento 
 escolhida e efetuar o cálculo adequado e exibir o valor a ser pago no final. 
 Código Condição de pagamento 
 1 	À vista em dinheiro ou cheque, recebe 10% de desconto
 2 	À vista no cartão de crédito, recebe 15% de desconto
 3 	Em duas vezes, preço normal de etiqueta sem juros
 4 	Em quatro vezes, preço normal de etiqueta mais juros de 10% */


public class Ex30 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double preco, aPagar;
		int opc;
		
		System.out.printf("Digite o preço do produto: ");
		preco = ler.nextDouble();
		
		System.out.printf("Opções de pagamento:\n ");
		System.out.printf("1 - A vista, dinheiro ou cheque.\n ");
		System.out.printf("2 - A vista no cartao de credito.\n ");
		System.out.printf("3 - Em duas vezes.\n ");
		System.out.printf("4 - Em quatro vezes.\n ");
		System.out.printf("Digite a forma de pagamento:\n ");
		opc = ler.nextInt();
		
		switch(opc) {
			case 1:
				
				aPagar = preco - (preco * 0.10);
				System.out.printf("O total a ser pago é de: %.2f.", aPagar);
				break;
				
			case 2:
				
				aPagar = preco - (preco * 0.15);
				System.out.printf("O total a ser pago é de: %.2f.", aPagar);
				break;
				
			case 3:
				
				aPagar = preco;
				System.out.printf("O total a ser pago é de: %.2f.", aPagar);
				break;
				
			case 4:
				
				aPagar = preco + (preco * 0.1);
				System.out.printf("O total a ser pago é de: %.2f.", aPagar);		
				break;
				
			default:
				System.out.println("Opção Inválida.");
		}
		
		ler.close();
		
	}

}
