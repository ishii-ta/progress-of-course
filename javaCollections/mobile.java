import java.util.*;

public class mobile {
    public static void main(String[] args) {

        List<String> mobile = new ArrayList<>();
        List<String> user = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 user details:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter user name: ");
            user.add(sc.nextLine());

            System.out.print("Enter mobile brand: ");
            mobile.add(sc.nextLine());
        }
        mobile.remove("apple");

        System.out.println("\nUser and Brand Details:");
        for (int i = 0; i < user.size(); i++) {
            System.out.println("User: " + user.get(i) + " | Brand: " + mobile.get(i));
        }

        sc.close();
    }
}
