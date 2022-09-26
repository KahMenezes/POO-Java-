package Aula05;

/* Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que utilize
essa classe para cadastrar 10 produtos em uma lista de produtos. Ao final exibir apenas os
produtos cujo valor é menor do que 100 reais.*/

import java.util.Scanner;

public class Produto_Valor {

	public static void main(String[] args) {
				
			Scanner ler = new Scanner(System.in);
			
		
			Produto[] listaProdutos = new Produto[10];
			
			for (int i=0; i<=9; i++) {
			
				Produto p = new Produto();
				
				
				System.out.printf("Digite o id do Produto: ");
				p.id = ler.nextInt();
				
				System.out.printf("Digite a descrição do Produto: ");
				p.descricao = ler.next();
				
				System.out.printf("Digite o valor do Produto: ");
				p.valor = ler.nextDouble();
				
				System.out.printf("Digite a quantidade do Produto: ");
				p.quantidade = ler.nextDouble();
				
				listaProdutos[i] = p;
			
			}
			
			for (int i=0; i<=9; i++) {
				
				if (listaProdutos[i].valor < 100) {
				
					System.out.printf("\n Produto Id %d, Descrição %s, Valor %.2f, quantidade %.2f tem valor menor que R$ 100,00 !",
					listaProdutos[i].id, listaProdutos[i].descricao, listaProdutos[i].valor, listaProdutos[i].quantidade);
					
				}
				
			}
			
	}

}
