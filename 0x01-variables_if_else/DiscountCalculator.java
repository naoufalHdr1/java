public class DiscountCalculator {
    public static void main(String[] args) {
    	double price = 100.0;
        double discountRate = 15.0;

        double discount = (discountRate / 100) * price;
        double finalPrice = price - discount;

        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }
}
