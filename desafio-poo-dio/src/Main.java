import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso Curso1 = new Curso("curso java", "descrição curso java", 8);
        Curso Curso2 = new Curso("curso js", "descrição curso js", 4);

        Mentoria mentoria1 = new Mentoria("mentoria de java", "descrição mentoria de java", LocalDate.now());

        System.out.println(Curso1);
        System.out.println(Curso2);

        System.out.println(mentoria1);

    }
}
