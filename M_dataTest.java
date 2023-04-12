package javaProject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class M_dateTest {
    public static void main(String[] args) {
        String str1 = "1234";
        String str2 = "30";
        int ine = Integer.parseInt(str2 + str1);
        System.out.println(ine);

        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(month + " " + day);
        System.out.println(calendar.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日,HH:mm:ss");
        System.out.println(sdf.format(calendar.getTime()));
    }
}
