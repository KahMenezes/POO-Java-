package Aula04;

/* 40. Exibir os vinte primeiros valores da série de Bergamaschi. 
 A série: 1, 1, 1, 3, 5, 9, 17, ... */

public class Ex40 {

	public static void main(String[] args) {
		
		int soma, a = 1, b = 1, c = 1;
		
		for(int i = 0; i < 20; i++) {
			if(i < 3) {
				System.out.printf("\n1");
			}
			else {
				soma = a + b + c;
				System.out.printf("\n%d",(soma));
				c = b;
				b = a;
				a = soma;
			}
		}

	}

}
