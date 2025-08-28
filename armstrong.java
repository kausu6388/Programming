import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int original  = n ;
        int sum= 0;
        while (n>0) {
            int rem  = n %10;
            sum = sum +rem*rem*rem;
            n= n/10;
        }
        if(original == sum ){
            System.out.println("armstrong");
        } else{
            System.out.println("not armstrong");
        }
        
    }
    
}