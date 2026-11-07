
import java.util.Scanner;
import java.util.Random;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // a
        int n = 1;
        while (Math.pow(n, 3) < 2000) {
            n++;
        }
        System.out.println("a. Largest n: " + (n - 1));

        // b
        System.out.println("b. Squares:");
        for (int i = 1; i <= 12; i++) {
            System.out.println(i * i);
        }

        // c
        System.out.println("c. 4x5 Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(random.nextInt(101) + "\t");
            }
            System.out.println();
        }

        // d
        System.out.print("d. Enter a number: ");
        int number = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // e
        double total = 0;
        for (int i = 1; i <= 25; i++) {
            total += (double) i / (26 - i);
        }
        System.out.printf("e. Series sum: %.2f%n", total);

        input.close();
    }
}
