class Profit_And_Loss {
    public static void main(String[] args) {
        int cost_Price = 129, selling_Price = 191;
        int profit = selling_Price - cost_Price;
        double profit_Percentage = (profit / (double) cost_Price) * 100;
        System.out.println("The Cost Price is INR " + cost_Price + " and Selling Price is INR " + selling_Price + "\n" +
                           "The Profit is INR " + profit + " and the Profit Percentage is " + profit_Percentage);
    }
}
