import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author Itallo Moreno
 */


public class Aplic {
    

 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {

    Scanner entrada =  new Scanner(System.in);
    Aluno objAluno = new Aluno();
    int OPC;
        
 
       System.out.println("Digite o RA do aluno:");
       objAluno.setRA(entrada.nextInt());
       System.out.println("Digite a nota da 1º Prova:");
       objAluno.setNtPvr1(entrada.nextDouble());
       System.out.println("Digite a nota da 2º Prova:");
       objAluno.setNtPvr2(entrada.nextDouble());
       System.out.println("Digite a nota do 1º Trabalho:");
       objAluno.setNtTbr1(entrada.nextDouble());
       System.out.println("Digite a nota do 2º Trabalho:");
       objAluno.setNtTbr2(entrada.nextDouble());
       
     do{
           System.out.println("1 - Exibir Nota das Provas/Trabalhos: ");
           System.out.println("2 - Exibir Media dos trabalhos/Provas: ");
           System.out.println("3 - Exibir Media Final: ");
           System.out.println("4 - Sair");
           
           System.out.println("/n Digite a Opcao: ");
           OPC = entrada.nextInt();

            System.out.println("\n\nRa: " + objAluno.getRA());
            switch (OPC) {
        case 1:
          System.out.println("Nota da 1º Prova    : " + objAluno.getNtPvr1());
          System.out.println("Nota da 2º Prova    : " + objAluno.getNtPvr2());
          System.out.println("Nota do 1º Trabalho : " + objAluno.getNtTbr1());
          System.out.println("Nota do  2º Trabalho : " + objAluno.getNtTbr2());
            break;

        case 2:
            System.out.println("Média dos Trabalhos: " + objAluno.calcMediaTrab());
            System.out.println("Média das Provas   : " + objAluno.calcMediaProva());
             break;

        case 3:
            System.out.println("Média Final : " + objAluno.calcMediaFinal());
            break;       
            }
     }while (OPC < 4);

    }
}
 


 


