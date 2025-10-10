package Recursion;
import java.util.*;
class Sumofdigit{
    public static int Sumofdigit(int n){
        if(n==0){
            return 0;
            
        }
        int sum = Sumofdigit(n/10);
        int result = sum + n % 10;
        return result;
        
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sumofdigit(n));
        sc.close();
        
    }
}