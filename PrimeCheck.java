import java.util.Scanner;

// public class Primenum {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         boolean ans = isPrime(n);
//         System.out.println(ans);
//     }

//     static boolean isPrime(int n){
//         if (n<=1){
//             return false;
//         }

//         int c = 2;
//         while (c*c<=n) {
//             if(n%c==0){
//                 return false;
//             }
//             c++;

            
//         }
//         return c*c>n;
//     }


// }



import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is NOT a Prime number.");
        }

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}