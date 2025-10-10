import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Multiplication table of " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println((n * i));
            }
        }
        
    }
}
