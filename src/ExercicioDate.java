import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioDate {

    public static void main(String[] args) throws ParseException {

        //Formatando a data e passando a data de nascimento
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Date dataNascimento = format.parse("1995-06-02 00:00:00:000");

        //Pegando a data de nascimento no formato epoch
        Date nascimentoMili = new Date(dataNascimento.getTime());
        System.out.println(nascimentoMili);

        //Definindo data para comparação
        Date data = format.parse("2015-05-15 00:00:00:000");
        Date dataMili = new Date(data.getTime());

        //Fazendo a comparação entre as datas
        System.out.println(nascimentoMili.after(dataMili));
        //false
        System.out.println(nascimentoMili.before(dataMili));
        //true
    }
}
