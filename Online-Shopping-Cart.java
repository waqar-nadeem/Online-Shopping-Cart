import java.util.Scanner;

public class OnlineShoppingCart {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double totalAmount = 0.0; 
        String continueShopping = "yes";
        System.out.println("\n===== Online Shopping Cart =====\n");
        while (true) {
            System.out.print("Enter the item name: ");
            String itemName = s.nextLine();  
            System.out.print("Enter the quantity for " + itemName + ": ");
            int quantity = s.nextInt(); 
            System.out.print("Enter the price per item for " + itemName + ": ");
            double price = s.nextDouble(); 
            s.nextLine();  
            double itemTotal = quantity * price;
            totalAmount += itemTotal;  
            System.out.printf("%d x %s at $%.2f each: $%.2f\n", quantity, itemName, price, itemTotal);
            System.out.print("Do you want to add another item? (yes/no): ");
            String response = s.nextLine(); 
            if (response.length() < 1 || response.charAt(0) != 'y') {
                break;
            }
        }
        System.out.printf("\nCart Total: $%.2f", totalAmount);
        s.close();
    }
}
