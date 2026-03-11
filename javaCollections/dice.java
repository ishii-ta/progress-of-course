import java.util.Scanner;

public class dice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Dice Game");
        System.out.println("1. Roll the Dice");
        System.out.println("2. Stop the Game");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();

        switch(choice){
        case 1:
                   int player1=(int)(Math.random()*6)+1;
                   int player2=(int)(Math.random()*6)+1;
                   System.out.println("number of player1" + " " + player1 );
                   System.out.println("number of player2" + " " + player2 );

                    if (player1 > player2) {
                         System.out.println("Player1 is the winner");
                         } 
                         else if (player2 > player1) {
                         System.out.println("Player2 is the winner");
                         } 
                         else {
                         System.out.println("draw");
                        }
                        break;
        case 2:
                System.out.println("Game Stopped. Thank you for playing!");
                 break;

        default:
                System.out.println("Invalid choice!");
        }

        sc.close();

        
    }
}