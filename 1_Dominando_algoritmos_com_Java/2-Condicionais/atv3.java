import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int senhaVálida=1234, senhaDiscada=0;
        
        System.out.println("Digite sua senha de acesso:");
        senhaDiscada = scan.nextInt();

        if (senhaDiscada==senhaVálida){
            System.out.println("Acesso permitido");
        }
        else{
            System.out.println("Acesso negado");
        }
    }
}
