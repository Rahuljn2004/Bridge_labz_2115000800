import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String date1 = scanner.nextLine();
        
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String date2 = scanner.nextLine();
        
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);
        
        if (localDate1.isBefore(localDate2)) {
            System.out.println(localDate1 + " is before " + localDate2);
        } else if (localDate1.isAfter(localDate2)) {
            System.out.println(localDate1 + " is after " + localDate2);
        } else if (localDate1.isEqual(localDate2)) {
            System.out.println(localDate1 + " is the same as " + localDate2);
        }
    }
}
