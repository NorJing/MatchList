import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Percy on 21/06/17.
 */
public class Utils {
    public static Date parseDate(String date){
        try {
            return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(date);
        }catch (ParseException e){
            return null;
        }
    }
}
