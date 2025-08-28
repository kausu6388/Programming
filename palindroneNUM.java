import java.util.Scanner;

public class palindroneNUM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0,temp  = n;
        while(n>0){
            int rem = n%10;
            sum = sum*10 +rem;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("palindrone");
        }
        else{
            System.out.println("not a palindrone");
        }
    }
    
}
