public class CreditCardValidator {
    public static boolean isValidCard(String card) {
        return card.matches("^4\\d{15}$") || card.matches("^5\\d{15}$");
    }

    public static void main(String[] args) {
        System.out.println(isValidCard("4111111111111111")); // true (Visa)
        System.out.println(isValidCard("5111111111111111")); // true (MasterCard)
        System.out.println(isValidCard("6111111111111111")); // false
    }
}
