import java.util.Scanner;

public class sumnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        }
        
    }
}