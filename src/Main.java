import br_com_dio_desafio_dominio.Bootcamp;
import br_com_dio_desafio_dominio.Curso;
import br_com_dio_desafio_dominio.Dev;
import br_com_dio_desafio_dominio.Mentorias;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

      Curso curso1 = new Curso();

      curso1.setTitulo("Curso java");
      curso1.setDescricao("Aula de Programação Orientada a Objetos");
      curso1.setCargaHoraria(54);
    //System.out.println(curso1);

      Curso curso2 = new Curso();

      curso2.setTitulo("Curso JavaScript");
      curso2.setDescricao("'Variáveis no JavaScript'");
      curso2.setCargaHoraria(40);
    //System.out.println(curso2);

      Curso curso3 = new Curso();

      curso3.setTitulo("Curso Git");
      curso3.setDescricao("'Comandos básicos no git'");
      curso3.setCargaHoraria(20);
  //  System.out.println(curso3);

      Mentorias mentoria = new Mentorias();

      mentoria.setTitulo("Primeira mentoria");
      mentoria.setDescricao("'Descrição da primeira mentoria' ");
      mentoria.setData(LocalDate.now());
      mentoria.toString();
      //System.out.println(mentoria);
      

      Bootcamp bootcamp = new Bootcamp();

      bootcamp.setName("Bootcamp Backend com Java");
      bootcamp.setDescricao("'Nesse bootcamp você vai apreder a linguagem de programação Java do zero'");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(curso3);
      bootcamp.getConteudos().add(mentoria);

      Dev primeiroDev = new Dev();
      primeiroDev.setNome("Daniele");
      primeiroDev.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos inscritos de Daniele: " + primeiroDev.getConteudosInscritos());
      primeiroDev.progredir();
      primeiroDev.progredir();
      System.out.println("-");
      System.out.println("Conteudos concluídos de Daniele: " + primeiroDev.getConteudosConcluidos());
      System.out.println("Conteudos inscritos de Daniele: " + primeiroDev.getConteudosInscritos());
      System.out.println("XP: " + primeiroDev.calcularTotalXP());
      
      System.out.println("-----------------------------");
      
      
      Dev segundoDev = new Dev();
      segundoDev.setNome("João");
      segundoDev.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos inscritos de João: " + segundoDev.getConteudosInscritos());
      segundoDev.progredir();
      segundoDev.progredir();
      segundoDev.progredir();
      segundoDev.progredir();
      System.out.println("-");
      System.out.println("Conteudos concluídos de João: " + segundoDev.getConteudosConcluidos());
      System.out.println("Conteudos inscritos de João: " + segundoDev.getConteudosInscritos());
      System.out.println("XP: " + segundoDev.calcularTotalXP());
      
    }
  
}
