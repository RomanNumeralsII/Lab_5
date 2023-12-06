import java.util.Scanner;

public class Shipping_Cost {
        public static void main(String[] args)
        {
            Scanner console = new Scanner(System.in);

            System.out.println("Enter price of item: ");
            double itemPrice = console.nextDouble();

            double shippingCost = (itemPrice >= 100) ? 0 : (0.02 * itemPrice);
            System.out.println("Your total shipping cost is: $" + String.format("%.2f", shippingCost));

            double totalPrice = itemPrice + shippingCost;
            System.out.println("your overall cost is: $" + String.format("%.2f", totalPrice));

        }

}
