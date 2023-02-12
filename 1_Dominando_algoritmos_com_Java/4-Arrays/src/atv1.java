import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        

        final int tam=5;
        char [] gabarito = {'a','b','c','d','e'};
        char [] respostas = new char[tam];
        Scanner scan = new Scanner(System.in);
        int nota=0;

        for(int i=0; i<tam;i++){
            System.out.println("Digite sua resposta " + i + ":");
            respostas[i] = scan.nextLine().charAt(0);
        
        }

        for(int i=0;i<tam;i++){
            if(respostas[i]==gabarito[i]){
                nota++;
            }
        }
        System.out.println("Sua nota foi: " + nota);
      
       
    }
}
