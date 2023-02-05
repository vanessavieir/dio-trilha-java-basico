package BrComDioColectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exemplo2 {
    public static void main(String[] args) {

        List<Gato> meusGatinhos = new ArrayList<>(){{
            add(new Gato("Ana", 8, "amarela"));
            add(new Gato("Lúcio", 12, "cinza"));
            add(new Gato("Bernardo", 10, "preto"));

        }};

        System.out.println("--\tOrdem de inserção\t---" );
        System.out.println(meusGatinhos + "\n");
        
        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatinhos);
        System.out.println(meusGatinhos + "\n");

        System.out.println("--\tOrdem natural\t---");
        Collections.sort(meusGatinhos);
        System.out.println(meusGatinhos + "\n");

        System.out.println("--\tOrdem por idade\t---");
        Collections.sort(meusGatinhos, new comparatorIdade());
        System.out.println(meusGatinhos + "\n");

        System.out.println("--\tOrdem por cor\t---");
        Collections.sort(meusGatinhos, new comparatorCor());
        System.out.println(meusGatinhos + "\n");

        System.out.println("--\tOrdem por Nome/Cor/Idade\t---");
        Collections.sort(meusGatinhos, new comparatorNomeCorIdade());
        System.out.println(meusGatinhos + "\n");


        
        
    }
}

class Gato implements Comparable<Gato>{

    private String nome;
    private Integer idade;
    private String cor;


    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }


    public Integer getIdade() {
        return idade;
    }


    public String getCor() {
        return cor;
    }

    @Override
    public String toString(){
        return"{" + "nome= '" + nome + '|'+
        ",idade= " + idade + '|' +
        ",cor= " + cor + '|'+
        "}";

       
    }
    // A sobrescrição é utilizada para descobrir a ordem natural dos elementos, comparando-os com os demaais
    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

    class comparatorIdade implements Comparator<Gato>{
        @Override
        public int compare(Gato g1, Gato g2) {
            // TODO Auto-generated method stub
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }

    }

    class comparatorCor implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            // TODO Auto-generated method stub
            return g1.getCor().compareToIgnoreCase(g2.getCor());
        }

    }

    class comparatorNomeCorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            // TODO Auto-generated method stub
            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if(nome!= 0) return nome;

            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            if(nome!= 0) return nome;

            return Integer.compare(g1.getIdade(), g2.getIdade());

        }

    }

 




