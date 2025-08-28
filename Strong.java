import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int originsl  = n;
        int sum = 0;
        while(n>0){
            int fact = 1;
            int rem = n%10;
            for(int i = 1;i<=rem;i++){
                fact = fact*i;
            }
            sum = sum + fact;
            n = n/10;

            
                
            
        }
        if(originsl == sum){
            System.out.println("strong number");
        } else{
            System.out.println("not strong number");
        }
        
    }
    
}
