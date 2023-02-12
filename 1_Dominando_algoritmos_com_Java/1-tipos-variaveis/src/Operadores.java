
public class Operadores {
    public static void main(String[] args) {

        //Concatenations 

        // String fullName="VANESSA "+"FERREIRA"+" VIEIRA";
        // System.out.println(fullName);
        
        // String concatenation="?";

        // concatenation=1+1+1+"1";
        // System.out.println(concatenation);

        // concatenation="1"+1+1;
        // System.out.println(concatenation);
        // concatenation="1"+"1"+1+1;
        // System.out.println(concatenation);

        // Autoincrement
        // int n=6;
        // n+=3;
        // n--;
        // System.out.println(n);

        //Denying a truth

        //boolean variable =true;
        // A "!" faz com que a verdade da operação seja negada
        //System.out.println(!variable);


        //Ternary value

        // int a, b;
        // a=2;
        // b=3;

        // String resultado= a==b? "verdadeira": "falsa";
        // String valor= a!=b? "verdadeiro": "falsa";
        // System.out.println("A igualdade entre A e B é "+resultado);
        // System.out.println(valor);

        // Valores relacionais

        String name1="Vanessa";
        String name2="Vanessa";

        System.out.println((name1).equals(name2));// O uso do equals é para comparar duas variáveis


        int number1=10;
        int number2=20;

        if (number1==number2){
            System.out.println("A condição de igualdade entre os dois números é verdadeira.");}
        else{
            System.out.println("A condição de igualdade entre os dois números é falsa.");
        }

        boolean yesNo= number1==number2;

        yesNo= number1>number2;

        System.out.println(yesNo);

        yesNo= number2>number1;
        System.out.println(yesNo);

        }
}
