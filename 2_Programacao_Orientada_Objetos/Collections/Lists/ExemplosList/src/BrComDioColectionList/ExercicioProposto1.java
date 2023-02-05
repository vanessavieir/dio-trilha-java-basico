package BrComDioColectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioProposto1 {
    public static void main(String[] args) {

        List<Double> mediaTemperaturaMeses = new ArrayList<>();

       mediaTemperaturaMeses.add(35.0);
       mediaTemperaturaMeses.add(7.0);
       mediaTemperaturaMeses.add(0.0);
       mediaTemperaturaMeses.add(25.0);
       mediaTemperaturaMeses.add(10.0);
       mediaTemperaturaMeses.add(40.0);
       mediaTemperaturaMeses.add(0.5);

       System.out.println("Faça um programa que receba 6 temperaturas médias: " + "\n");

        
        Iterator<Double> iterator = mediaTemperaturaMeses.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
        Double next= iterator.next();
        soma+=next;

    }

       System.out.println("Apresente a média semestral das temperaturas: " + (soma/mediaTemperaturaMeses.size()));


    }
    
}

class Meses implements Comparable<Meses>{

    

    private Integer mediaT;
    private String mes;


    public Meses(Integer media, String mes) {

        this.mediaT = media;
        this.mes = mes;
    }

    public Integer getMedia() {
        return mediaT;
    }

    public String getMes() {
        return mes;
    } 

    @Override
    public String toString(){
        return"{" + "nome= '" + mediaT + '|'+
        ",idade= " + mes + '|' +
        
        "}";
 }

    @Override
    public int compareTo(Meses meses) {
        // TODO Auto-generated method stub
        return this.getMes().compareToIgnoreCase(meses.getMes());
    }

    
}

