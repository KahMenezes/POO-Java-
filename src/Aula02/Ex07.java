package Aula02;

import java.util.Scanner;

/* 7. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente 
 * ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.
 */

public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, p3, p4, p5, soma, ValorRecebido, troco;
		
		System.out.printf("Informe o valor do 1º produto: ");
		p1 = ler.nextDouble();

		System.out.printf("Informe o valor do 2º produto: ");
		p2 = ler.nextDouble();

		System.out.printf("Informe o valor do 3º produto: ");
		p3 = ler.nextDouble();

		System.out.printf("Informe o valor do 4º produto: ");
		p4 = ler.nextDouble();

		System.out.printf("Informe o valor do 5º produto: ");
		p5 = ler.nextDouble();
		
		soma = p1 + p2 + p3 + p4 + p5;
		
		System.out.printf("O Total da compra é de: R$ %.2f, Informe o valor recebido: ", soma);		
		ValorRecebido = ler.nextDouble();

		troco = ValorRecebido - soma;
		
		System.out.printf("O seu troco é de: R$ %.2f ", troco);

		
	}

}



