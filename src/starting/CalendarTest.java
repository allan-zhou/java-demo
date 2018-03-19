import java.util.Calendar;

/**
 * CalendarTest
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//默认是当前日期   

        System.out.println("c.YEAR : " + c.get(c.YEAR));
        System.out.println("c.MONTH : " + (c.get(c.MONTH) + 1));
        System.out.println("c.DATE : " + c.get(c.DATE));
        System.out.println("c.DAY_OF_MONTH : " + c.get(c.DAY_OF_MONTH));
        System.out.println("c.HOUR : " + c.get(c.HOUR));
        System.out.println("c.HOUR_OF_DAY : " + c.get(c.HOUR_OF_DAY));
        System.out.println("c.MINUTE : " + c.get(c.MINUTE));
        System.out.println("c.SECOND : " + c.get(c.SECOND));
        System.out.println("c.DAY_OF_WEEK : " + c.get(c.DAY_OF_WEEK)); //1代表星期日、2代表星期1、3代表星期二，以此类推
    }
}