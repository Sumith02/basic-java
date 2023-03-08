import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {
            int sum=0,mul=1;
            System.out.println("enter the number"); 
            int n = as.nextInt();
   while(n!=0)
            {
                int rem = n%10;
                n=n/10;
                sum = sum +rem;
                mul=mul*rem;

            }
            if(sum==mul){
                System.out.println("same");

            }
            else{
                System.out.println("not same");
            }
        }
    }
}
