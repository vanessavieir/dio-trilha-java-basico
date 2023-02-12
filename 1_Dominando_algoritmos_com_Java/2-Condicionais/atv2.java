import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int anoNasc=0, anoAtual=2023;

        System.out.println("Nos informe em que ano você nasceu:");
        anoNasc = scan.nextInt();

        if ((anoAtual-anoNasc)>18){
            System.out.println("Você é maior de idade!");
        }
       else{
            System.out.println("Você é menor de idade");
       }

    }
}
