import java.util.Scanner;

public class sumOFitsDIGITS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in. nextInt();
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum = sum + digit;
            n = n/10;


        }
        System.out.println(sum);
    }
    
}
