import java.util.*;

public class Main {
// I know that using LocalDate class is much easier but
// i'm doing it using Calendar class for practise

    public static String getDay(String day,String month, String year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
        calendar.set(Calendar.MONTH,Integer.parseInt(month)-1);
        calendar.set(Calendar.YEAR,Integer.parseInt(year));
        int dayOfWeekInteger = calendar.get(Calendar.DAY_OF_WEEK);
        String dayOfWeekString = "";
        switch (dayOfWeekInteger){
            case 2:
                dayOfWeekString += "MONDAY";
                break;
            case 3:
                dayOfWeekString += "TUESDAY";
                break;
            case 4:
                dayOfWeekString += "WEDNESDAY";
                break;
            case 5:
                dayOfWeekString += "THURSDAY";
                break;
            case 6:
                dayOfWeekString += "FRIDAY";
                break;
            case 7:
                dayOfWeekString += "SATURDAY";
                break;
            case 1:
                dayOfWeekString += "SUNDAY";
                break;
        }
        return dayOfWeekString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}
