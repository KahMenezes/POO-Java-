package Aula03;

import java.util.Scanner;

/* 24. Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. 
Caso sexo seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).*/

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome, sexo, estadoCivil;
		int anos;
		
		System.out.printf("Digite seu nome: ");
		nome = ler.nextLine();
		
		System.out.printf("Digite seu sexo (F) para feminino e (M) para masculino: ");
		sexo = ler.nextLine();
		
		System.out.printf("Digite seu estado civil:");
		estadoCivil = ler.nextLine();
		
		if(sexo.toUpperCase().equals("F") && estadoCivil.toUpperCase().equals("CASADA")) {
			System.out.printf("Digite a quantos tempo de casada:");
			anos = ler.nextInt();
			System.out.printf("Nome: %s; Sexo: %s; Estado civil: %s; Anos de casamento:%d ", nome, sexo, estadoCivil, anos);
		}else{
			System.out.printf("Nome: %s; Sexo: %s; Estado civil: %s.", nome, sexo, estadoCivil);
		}
	
		ler.close();
	
	}
	
}

