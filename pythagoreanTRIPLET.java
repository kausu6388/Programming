import java.util.Scanner;

public class pythagoreanTRIPLET {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b){
            System.out.println("pythagorean triplet");
        }
        else{
            System.out.println("not a pythagorean triplet");
        }
    }

    
}