import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first value");
	int a = sc.nextInt();
	System.out.println("enter the second value");
	int b = sc.nextInt();
	System.out.println("select the operations");
	System.out.println("addition-a: multiplication-m: division-d: substraction-s:");
	char op = sc.next().charAt(0);
	switch(op)
	{
	case 'a' : System.out.println("sum of the given two number:" +(a+b));
				break;
	case 's' : System.out.println("difference between two numbers:" +(a-b));
				break;
	case 'm' : System.out.println("product of the two numbers:" +(a*b));
				break;
	case 'd' : System.out.println("division of the two numbers:" +(a/b));
	break;
	
	default : System.out.println("invalid operations");
	
	}
}
}
