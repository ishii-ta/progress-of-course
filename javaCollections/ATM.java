import java.util.Scanner; 
public class ATM{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int pin = 1234;           
        double balance = 10000;   
        int choice;

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN. Access Denied!");
            return;
        }

        do{
            System.out.println("ATM options");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Change PIN");
            System.out.println("4. Check Balance");
            System.out.println("5. Quick Withdrawal");
        
            System.out.print("enter choice");
            choice=sc.nextInt();

            switch (choice) {
            case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Amount deposited successfully!");
                    break;

                    
            case 2: 
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash.");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

            case 3:
                   System.out.println("enter old pin");
                   int oldpin=sc.nextInt();

                   if(oldpin==pin){
                    System.out.print("enter pin");
                    pin=sc.nextInt();
                    System.out.print("pin changed succesfully");
                   }else{
                    System.out.print("incorrect pin");
                   }
                   break;

            case 4:
                   System.out.println("Your current balance is: ₹" + balance);
                   break;

            case 5:
                    System.out.println("Quick Withdrawal Options:");
                    System.out.println("1. ₹1000");
                    System.out.println("2. ₹2000");

                    System.out.print("Select option: ");
                    int qw = sc.nextInt();
                    int amount = 0;

                    if (qw == 1) amount = 1000;
                    else if (qw == 2) amount = 2000;
                    else {
                        System.out.println("Invalid option!");
                        break;
                    }

                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Please collect ₹" + amount);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

            case 6: 
                    System.out.println("Thank you for using ATM. Goodbye!");
                    break;


            default:
                    System.out.println("Invalid choice. Try again!");

        }
    }while(choice !=6);
    sc.close();

    }
}