import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // String name = args[0];
        // String surname = args[1];
        // int age = Integer.valueOf(args[2]);
        // double height = Double.valueOf(args[3]);

        // System.out.println("Olá, eu me chamo "+ nome  +  sobrenome);

        // System.out.println("Tenho"+ idade +" anos");

        // System.out.println("Minha altura é: "+ altura +" cm");


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
    }
}
