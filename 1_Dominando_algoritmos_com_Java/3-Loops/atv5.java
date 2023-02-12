import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int limite=5, i=0, num=0, maior=0;
        
        while(i<limite){
        System.out.println("Digite um número:");
        num = scan.nextInt();
        i++;
        
        if (num>maior){
            maior=num;
        }
        }

        System.out.println("Maior número: " + maior);
    }
}
