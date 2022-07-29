import java.util.Scanner;

public class _12Excersice {

    public static boolean calcDate(int day, int month, int year) {
        int month28Days = 28;
        int month30Days = 30;
        int month31Days = 31;

        int calendarDay = day;
        int calendarMonth = month;
        int calendarYear = year;

        if ((calendarMonth == 2) && (calendarDay > 0 && calendarDay > month28Days) ||
                (calendarMonth == 4) && (calendarDay > 0 && calendarDay > month30Days) ||
                (calendarMonth == 6) && (calendarDay > 0 && calendarDay > month30Days) ||
                (calendarMonth == 9) && (calendarDay > 0 && calendarDay > month30Days) ||
                (calendarMonth == 11) && (calendarDay > 0 && calendarDay > month30Days) ||
                (calendarMonth == 1) && (calendarDay > 0 && calendarDay > month31Days) ||
                (calendarMonth == 3) && (calendarDay > 0 && calendarDay > month31Days) ||
                (calendarMonth == 5) && (calendarDay > 0 && calendarDay > month31Days) ||
                (calendarMonth == 7) && (calendarDay > 0 && calendarDay > month31Days) ||
                (calendarMonth == 8) && (calendarDay > 0 && calendarDay > month31Days) ||
                (calendarMonth == 10) && (calendarDay > 0 && calendarDay > month31Days) ||
                (calendarMonth == 12) && (calendarDay > 0 && calendarDay > month31Days)) {
            return false;
        }
        if (calendarDay < 0 && calendarDay > month31Days) {
            if (calendarMonth < 0 && calendarMonth > 12) {
                if (calendarYear < 1900 && calendarYear > 3000) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa dia mes y año separado por -");
        int[] date = { 30, 8, 2000 };

        int day = date[0];
        int month = date[1];
        int year = date[2];

        boolean calValue = calcDate(day, month, year);

        if (calValue) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("la fecha es incorrecta");
        }

    }

}
