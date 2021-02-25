import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ExercicioCalendar {

    public static void main(String[] args) {

        Calendar data = Calendar.getInstance();
        System.out.println("A data de hoje é: " + data.getTime());

        data.add(Calendar.DATE, 10);
        System.out.println("A data de vencimento é: " + data.getTime());

        if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            data.add(Calendar.DATE, 2);
            System.out.println("Vencimento cai num sábado, pode ser pago no dia: " + data.getTime() +
                    ", sendo assim, possui 12 dias para pagar.");
        } else if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            data.add(Calendar.DATE, 1);
            System.out.println("Vencimento cai num domingo, pode ser pago no dia: " + data.getTime() +
                    ", sendo assim, possui 11 dias para pagar.");
        }
    }
}
