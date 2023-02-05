package BrComDioDesafio;

import java.time.LocalDate;

import BrComDioDesafio.Dominio.Bootcamp;
import BrComDioDesafio.Dominio.Curso;
import BrComDioDesafio.Dominio.Dev;
import BrComDioDesafio.Dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrevendo o uso de Poo em java");
        curso1.setCargaHoraria(8);

        Curso curso2 =  new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descricao curso java");
        curso2.setCargaHoraria(9);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descricao Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVanessa = new Dev();
        devVanessa.setNome("Vanessa");
        devVanessa.inscreverBootcamp(bootcamp);
        devVanessa.progredir();
        System.out.println("-");
        System.out.println("\n" + "Conteudos Inscritos Vanessa: " + devVanessa.getConteudosinscritos() + "\n");
        System.out.println("\n" + "Conteudos Concluídos Vanessa: " + devVanessa.getConteudosConcluidos() + "\n");
        System.out.println("XP:" + devVanessa.calcularTotalXp());


        System.out.println("-------------------------------------------------------------------------------------------");

        Dev devJose = new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp);
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos José: " + devJose.getConteudosinscritos() + "\n");
        System.out.println("Conteudos Concluídos José: " + devJose.getConteudosConcluidos() + "\n");
        System.out.println("XP:" + devJose.calcularTotalXp());


    }
}
