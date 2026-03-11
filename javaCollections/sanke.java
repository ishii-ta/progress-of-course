import java.util.Scanner;
import java.util.Random;

public class SnakeGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int size = 5; // 5x5 grid
        int snakeX = 0, snakeY = 0;

        int targetX = rand.nextInt(size);
        int targetY = rand.nextInt(size);

        System.out.println("---- Snake Game ----");
        System.out.println("Grid Size: 5 x 5");
        System.out.println("Reach the target to win!");

        while (true) {
            System.out.println("\nSnake Position: (" + snakeX + "," + snakeY + ")");
            System.out.print("Move (U/D/L/R): ");
            char move = sc.next().charAt(0);

            switch (move) {
                case 'U':
                case 'u':
                    snakeX--;
                    break;
                case 'D':
                case 'd':
                    snakeX++;
                    break;
                case 'L':
                case 'l':
                    snakeY--;
                    break;
                case 'R':
                case 'r':
                    snakeY++;
                    break;
                default:
                    System.out.println("Invalid Move!");
            }

        
            if (snakeX < 0 || snakeX >= size || snakeY < 0 || snakeY >= size) {
                System.out.println("Snake touched the wall. Game Over!");
                break;
            }

            // Target reached
            if (snakeX == targetX && snakeY == targetY) {
                System.out.println("Snake reached the target. You Win!");
                break;
            }
        }

        sc.close();
    }
}
