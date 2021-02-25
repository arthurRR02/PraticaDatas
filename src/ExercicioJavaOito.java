import java.time.LocalDateTime;

public class ExercicioJavaOito {

    public static void main(String[] args){

        //Capturando o momento atual
        LocalDateTime agora = LocalDateTime.of(2010, 05, 15, 10, 00, 00);
        System.out.println(agora);

        //Levando a data a um momento futuro
        LocalDateTime futuro = agora.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(futuro);
    }
}
