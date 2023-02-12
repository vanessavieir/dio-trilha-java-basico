import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
    int quantMaca=0;

    System.out.println("Quantas maçâs você deseja comprar?");
    quantMaca = scan.nextInt();

    if (quantMaca < 12) {
        System.out.println("Valor total da compra: " + quantMaca*0.3);
    }
    else if (quantMaca >= 12){
        System.out.println("Valor total da compra: " + quantMaca*0.25);
    }

    }
}
