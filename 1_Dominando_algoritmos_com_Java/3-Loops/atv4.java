import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       
        int quantAlunos=0, i=0, aluno=0;
        int soma=0, media=0;

        System.out.println("Quantidade de alunos: ");
        quantAlunos = scan.nextInt();

        while(i<quantAlunos){
            System.out.println("Digite sua nota:");
            aluno = scan.nextInt();
            i++;
            soma=soma+aluno;
            media=soma/quantAlunos;
        }
        
        System.out.println(media);
    }

}
