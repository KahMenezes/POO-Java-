package Aula05;

public class Nota_aluno {

	public static void main(String[] args) {
        Aluno [] listaAluno = new Aluno[5];
        
        try (Scanner ler = new Scanner (System.in)) {
            for (int i=0; i<5; i++) {
                
            Aluno a = new Aluno();
            
            System.out.printf("Digite o RA: ");
            a.ra = ler.next();
            
            System.out.printf("Digite o nome: ");
            a.nome = ler.next();
            
            while (a.periodo == "noite" && a.periodo == "manha" && a.periodo == "tarde" )
            {
            System.out.printf("Digite o periodo (noite | manha | tarde): ");
            a.periodo = ler.next();
            }
            
            for (int j=0;j<6;j++)
            {
            System.out.printf("Digite as iniciais das materias: ");
            a.materias[j] = ler.next();
            }
            
            System.out.printf("\n");
            
            listaAluno [i] = a;
            
            }
        }
        
        for (int k=0; k<5; k++)
        {
            if(listaAluno[k].periodo .equals("noite"))        
            {    
            System.out.printf("\nRA: %s \nNome: %s \nPeriodo: %s", listaAluno[k].ra, listaAluno[k].nome, listaAluno[k].periodo);
            }    
        }    
    }    
}