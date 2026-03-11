import java.util.Scanner;

public class libr {

    static int maxBooks = 50;
    static int bookCount = 0;

    static int[] bookId = new int[maxBooks];
    static String[] bookTitle = new String[maxBooks];
    static String[] bookAuthor = new String[maxBooks];

    static void addBook(Scanner sc) {
        if (bookCount >= maxBooks) {
            System.out.println("Library is full!");
            return;
        }

        System.out.print("Enter Book ID (numbers only): ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a numeric Book ID.");
            sc.next();
        }
        bookId[bookCount] = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Book Title: ");
        bookTitle[bookCount] = sc.nextLine();

        System.out.print("Enter Author Name: ");
        bookAuthor[bookCount] = sc.nextLine();

        bookCount++;
        System.out.println("Book added successfully!");
    }

    static void searchBook(Scanner sc) {
        System.out.print("Enter Book ID to search: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a numeric Book ID.");
            sc.next();
        }
        int id = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (bookId[i] == id) {
                System.out.println("Book Found!");
                System.out.println("ID: " + bookId[i]);
                System.out.println("Title: " + bookTitle[i]);
                System.out.println("Author: " + bookAuthor[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }
    static void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("All Books in Library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(
                "ID: " + bookId[i] +
                ", Title: " + bookTitle[i] +
                ", Author: " + bookAuthor[i]
            );
        }
    }
    static void calculateFine(Scanner sc) {
        System.out.print("Enter number of days book was borrowed: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Enter days in numbers only.");
            sc.next();
        }
        int days = sc.nextInt();

        int allowedDays = 7;
        int finePerDay = 2;

        if (days > allowedDays) {
            int fine = (days - allowedDays) * finePerDay;
            System.out.println("Late return!");
            System.out.println("Fine to be paid: ₹" + fine);
        } else {
            System.out.println("Book returned on time. No fine.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Calculate Fine");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid choice! Please enter a number.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    searchBook(sc);
                    break;
                case 3:
                    displayBooks();
                    break;
                case 4:
                    calculateFine(sc);
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
