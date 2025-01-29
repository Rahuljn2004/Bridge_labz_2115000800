import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2025, 1, 29); // Example input date
        LocalDate newDate = inputDate.plusDays(7)
                                     .plusMonths(1)
                                     .plusYears(2)
                                     .minusWeeks(3);
        
        System.out.println("Original Date: " + inputDate);
        System.out.println("Modified Date: " + newDate);
    }
}
