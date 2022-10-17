package ni.com.fmedina;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {

        Calendar calFechaVencimiento = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        calFechaVencimiento.setTime(sdf.parse("2022-03-22 07:50:14"));
        calFechaVencimiento.add(Calendar.DATE, Integer.valueOf(364));

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdf2.format(calFechaVencimiento.getTime()));
    }
}
