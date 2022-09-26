package Aula05;

import java.util.Scanner;

public class Programa_Cliente {

public static void main(String[] args) {
	
	
	Scanner ler = new Scanner(System.in);
	

	Cliente[] listaClientes = new Cliente[5];
	
	for (int i=0; i<=4; i++) {
	
		Cliente c = new Cliente();
		
		
		System.out.printf("Digite o id do Cliente: ");
		c.id = ler.nextInt();
		
		System.out.printf("Digite o nome do Cliente: ");
		c.nome = ler.next();
		
		System.out.printf("Digite a idade do Cliente: ");
		c.idade = ler.nextInt();
		
		System.out.printf("Digite o e-mail do Cliente: ");
		c.email = ler.next();
		
		listaClientes[i] = c;
	
	}
	
	for (int i=0; i<=4; i++) {
		
		if (listaClientes[i].idade >=18) {
		
			System.out.printf("\nCliente Id %d, Nome %s, Idade %d, E-mail %s tem mais de 18 anos!",
			listaClientes[i].id, listaClientes[i].nome, listaClientes[i].idade, listaClientes[i].email);
			
		}
	}

}

}