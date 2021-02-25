import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioDateFormat {

    public static void main(String[] args){

        //Definindo o formato desejado para a data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss:SSS");
        //Capturando a data atual
        Date data = new Date();

        //Formatando a data
        String dataFormatada = sdf.format(data);
        System.out.println(dataFormatada);

    }
}
