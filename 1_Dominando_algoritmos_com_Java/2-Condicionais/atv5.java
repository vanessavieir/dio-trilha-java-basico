import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int valor1=0, valor2=0,valor3=0;
        int maior=0;

        System.out.println("Primeiro valor:");
        valor1 = scan.nextInt();

        System.out.println("Segundo valor:");
        valor2 = scan.nextInt();

        System.out.println("Terceiro valor:");
        valor3 = scan.nextInt();

        if (valor1>valor2 && valor1>valor3){
            maior=valor1;
        }
        else if(valor2>valor1 && valor2>valor3){
            maior=valor2;
        }
        else{
            maior=valor3;
        }

        System.out.println("O maior valor é: " + maior);
    }
}
