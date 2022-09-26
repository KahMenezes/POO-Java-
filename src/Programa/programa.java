package Aula06;

package Programa;

import java.util.Scanner;
 
public class programa {
 
    public static void main(String[] args) {
        Cliente[] listaClientes = new Cliente[5];
 
        Scanner ler = new Scanner(System.in);
 
        for (int i = 0; i < 2; i++) {
            int id = i, temConta = 0;
 
            String agencia = "", numero = "";
            double saldo = 0;
 
            System.out.printf("Dados do cliente %d", i + 1);
            System.out.println("");
 
            System.out.printf("Nome");
            String nome = ler.next();
 
            System.out.println("Email");
            String email = ler.next();
 
            System.out.println("Idade");
            int idade = ler.nextInt();
 
            System.out.println("Possui conta bancaria ? Sim [1]- Não[0]");
            temConta = ler.nextInt();
            
            
            if (temConta > 0) {
                System.out.println("Agencia");
                agencia = ler.next();
 
                System.out.println("Numero");
                numero = ler.next();
 
                System.out.println("Saldo");
                saldo = ler.nextDouble();
            }
 
            ContaBancaria conta = new ContaBancaria(agencia, numero, saldo);
            Cliente cl = new Cliente(id, nome, email, idade, conta);
            System.out.println("");
 
            listaClientes[i] = cl;
        }
 
        for (int i = 0; i < 2; i++) {
            System.out.println(listaClientes[i].exibirNomeIdade());
            if (!listaClientes[i].conta.agencia.equals("") && 
                !listaClientes[i].conta.numero.equals("")) {
                System.out.println(listaClientes[i].exibirDadosConta());
            }
            System.out.println("-------------------------");
 
        }
 
    }
 
}
 