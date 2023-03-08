import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the value of a");
            int a = sc.nextInt();
            System.out.println("enter the value of b");
            int b = sc.nextInt();
            try{
                a=a*b;
                b=a/b;
                a=a/b;
                System.out.println(a);
            System.out.println(b);
            }
catch(ArithmeticException s){
   System.out.println("a or b value cannot be 0");
}
        }
       
        
    }
}
