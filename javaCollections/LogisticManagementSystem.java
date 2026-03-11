
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LogisticManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Login Page");
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Login!");
            return;
        }

        LinkedList<String> customers = new LinkedList<>();

        System.out.println("Enter Customer Details:");
        System.out.print("Customer Name: ");
        String cname = sc.nextLine();
        System.out.print("Customer Number: ");
        String cnumber = sc.nextLine();

        customers.add("Name: " + cname + ", Number: " + cnumber);

        Set<String> deliveryPartners = new HashSet<>();

        System.out.println("\nEnter Delivery Partner Details:");
        System.out.print("Partner Name: ");
        String dname = sc.nextLine();
        System.out.print("Partner Number: ");
        String dnumber = sc.nextLine();
        System.out.print("Partner ID: ");
        String did = sc.nextLine();

        deliveryPartners.add("ID: " + did + ", Name: " + dname + ", Number: " + dnumber);

        HashMap<Integer, Integer> products = new HashMap<>();

        System.out.println("\nEnter Product Details:");
        System.out.print("Product ID: ");
        int pid = sc.nextInt();
        System.out.print("Product Quantity Available: ");
        int quantity = sc.nextInt();

        products.put(pid, quantity);

        System.out.println("Do you want to buy the product?");
        sc.nextLine();
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter Product ID: ");
            int buyPid = sc.nextInt();

            if (products.containsKey(buyPid)) {
                if (products.get(buyPid) > 0) {
                    System.out.println("Product is available. Order Confirmed!");
                } else {
                    System.out.println("Product not available (Out of Stock).");
                }
            } else {
                System.out.println("Product ID not found.");
            }
        }

        System.out.println("\nLogistic Management System Details");

        System.out.println("\nCustomer Details:");
        for (String c : customers) {
            System.out.println(c);
        }

        System.out.println("\nDelivery Partner Details:");
        for (String d : deliveryPartners) {
            System.out.println(d);
        }

        System.out.println("\nProduct Details:");
        for (Map.Entry<Integer, Integer> entry : products.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() +
                               ", Quantity Available: " + entry.getValue());
        }

        sc.close();
    }
}
