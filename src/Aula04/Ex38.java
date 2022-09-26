package Aula04;


/*38. Exibir a soma dos números inteiros positivos do intervalo de um a cem.*/

public class Ex38 {

	public static void main(String[] args) {
		
		int soma = 0, provisorio = 0;
		
		for(int x = 1; x <= 100; x++) {
			
			soma = x + provisorio;
			System.out.printf("\n%d + %d = %d",x, provisorio, soma);
			provisorio = soma;
			
		}
		
		System.out.printf("\nA A Soma dos inteiros de 1 a 100 é = %d", soma);
	}
	
}
