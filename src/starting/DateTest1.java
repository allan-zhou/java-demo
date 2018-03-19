import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * DateTest1
 */
public class DateTest1 {

    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("date.toString() : " + date.toString());
        // System.out.println("date.toLocaleString(): " + date.toLocaleString()); 
        // System.out.println("date.getHours() : " + date.getHours());

        // 使用 SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy-MM-dd 'at' hh:mm:ss a zzz");
        System.out.println(sdf.format(date));

        // 使用 Printf
        //c的使用  
        System.out.printf("全部日期和时间信息：%tc%n", date);
        //f的使用  
        System.out.printf("年-月-日格式：%tF%n", date);
        //d的使用  
        System.out.printf("月/日/年格式：%tD%n", date);
        //r的使用  
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
        //t的使用  
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
        //R的使用  
        System.out.printf("HH:MM格式（24时制）：%tR%n", date);

        // 使用toString()显示日期和时间
        System.out.printf(Locale.CHINA, "%1$s %2$tB %2$td, %2$tY %n", "Due date:", date);

        String dateStr = "2018-03-01 09:30:00";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            System.out.println(sdf2.parse(dateStr));
        } catch (Exception e) {
            System.out.println("Unparseable");
        }

        try {
            System.out.println(new Date().toString());
            Thread.sleep(3 * 1000);
            System.out.println(new Date().toString());

            long start = System.currentTimeMillis();
            Thread.sleep(3 *1000);
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("diff :" + diff);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}