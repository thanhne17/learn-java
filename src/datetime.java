import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class datetime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
//        System.out.println(cal);
//
//        cal.set(Calendar.YEAR, 2222);
//        cal.set(Calendar.MONTH, 10);
//        cal.set(Calendar.DAY_OF_MONTH, 17);
//
//        System.out.println(cal.get(Calendar.YEAR));
//        System.out.println(cal.get(Calendar.MONTH) + 1);
//        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        SimpleDateFormat dd = new SimpleDateFormat("17/10/2002");

        Date a = cal.getTime();
        String fmd = dd.format(a);
        System.out.println(fmd);
    }
}
