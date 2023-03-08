import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean isfound=false;
            System.out.println("enter the size");
            int n = sc.nextInt();
            System.out.println("enter the array elements");
            int[] a =new int[n];
for(int i=0; i<n; i++){
   a[i] = sc.nextInt();

}
System.out.println("enter the key to be searched");
int key =sc.nextInt();
for(int i=0; i<a.length; i++)
{
   if(a[i]==key){
            isfound=true;
            break;
   }

   }
   if(isfound)
   {
            System.out.println("found");
   }
   else{
            System.out.println("not found");
   }
        }
}
}