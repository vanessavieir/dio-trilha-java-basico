package BrComDioColectionList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


class Exemplo1 {
    public static void main(String[] args) {

    System.out.println( "Crie uma lista e adicione 7 elementos nela:");

    List<Double> notas= new ArrayList<>();
    notas.add(8.8);
    notas.add(7.0);
    notas.add(5.5);
    notas.add(4.7);
    notas.add(0.0);
    notas.add(2.9);
    notas.add(0.5);

    System.out.println(notas + "\n");


    System.out.println("Exiba a posição da nota 7.0:" + notas.indexOf(7.0d));

    System.out.println("Adicione a nota 8.0 na posição 4:"); 
    notas.add(4, 8.0);
    System.out.println(notas + "\n");

    System.out.println("Substitua a nota 4.7 pela nota 8.6:");
    notas.set(3, 8.6);
    System.out.println(notas + "\n");

    System.out.println("Confira se a nota 2.9 está na lista: " + notas.contains(2.9d) + "\n");
   
    System.out.println("Exiba todas as notas na ordem que foram informadas:");
    for(Double nota: notas){
        System.out.println(nota);
    }

    System.out.println("\n" + "Exiba a terceira a 3 nota:" + notas.get(2));

    System.out.println("Exiba a menor nota apresentada: " + Collections.min(notas));

    System.out.println("Exiba a maior nota apresentada: " + Collections.max(notas));


    Iterator<Double> iterator = notas.iterator();
    Double soma = 0.0;
    while(iterator.hasNext()){
    Double next= iterator.next();
    soma+=next;

    }
    System.out.println("Exiba a soma dos valores: " + soma );

    System.out.println("Exiba a média das notas: " + (soma/notas.size()));

    System.out.println("Remova o elemento 0 da lista: ");
    notas.remove(0.0);
    System.out.println(notas);

    System.out.println("Remova o elemento que está na posição 0: ");
    notas.remove(0);

    System.out.println("Remova os elementos menores 7.0: ");
    Iterator<Double> iterator1 = notas.iterator();
    while(iterator1.hasNext()){
        Double next = iterator1.next();
        if(next<7)iterator1.remove();
}
    System.out.println(notas);

    System.out.println("Apague toda a lista: " );
    notas.clear();
    System.out.println(notas);

    System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }



}
