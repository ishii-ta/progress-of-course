import java.util.*;
public class mobile1{
    public static void main(String[] args) {

        Map<String, String> userBrand = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 user details:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter user name: ");
            String user = sc.nextLine();

            System.out.print("Enter mobile brand: ");
            String brand = sc.nextLine();

            userBrand.put(user, brand); 
        }
        userBrand.values().remove("apple");

        System.out.println("User and Brand Details:");
        for (Map.Entry<String, String> entry : userBrand.entrySet()) {
            System.out.println("User: " + entry.getKey() +"Brand: " + entry.getValue());
        }

        sc.close();
    }
}