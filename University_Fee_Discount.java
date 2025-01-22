class University_Fee_Discount {
    public static void main(String[] args) {
        int fee = 125000;
        int discount_Percent = 10;
        int discount = (fee * discount_Percent) / 100;
        int discounted_Fee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discounted_Fee);
    }
}