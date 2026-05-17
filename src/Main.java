import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Aprenda Java do básico ao avançado");
        cursoJava.setCargaHoraria(8);

        Curso cursoSpring = new Curso();
        cursoSpring.setTitulo("Curso Spring Boot");
        cursoSpring.setDescricao("Criação de APIs REST com Spring Boot");
        cursoSpring.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Carreira Java");
        mentoria.setDescricao("Como evoluir na carreira backend");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Backend");
        bootcamp.setDescricao("Bootcamp focado em Java e POO");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoSpring);
        bootcamp.getConteudos().add(mentoria);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos: " + devVinicius.getConteudosInscritos());

        devVinicius.progredir();
        devVinicius.progredir();

        System.out.println("Conteúdos inscritos: " + devVinicius.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devVinicius.getConteudosConcluidos());
        System.out.println("XP total: " + devVinicius.calcularTotalXp());
    }
}
