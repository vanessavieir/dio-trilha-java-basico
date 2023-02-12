import java.util.Scanner;
public class atv1 {
    public static void main(String[] args) {
        
        Scanner scan =  new Scanner(System.in);

        int num1=0, num2=0, maior=0;

        System.out.println("Digite o primeiro valor:");
        num1=scan.nextInt();

        System.out.println("Digite o segundo valor:");
        num2=scan.nextInt();

        if (num1>maior) {
            maior=num1;
        }
        else if (num2>maior){
            maior=num2;
        }

        System.out.println(maior);
    }
}
