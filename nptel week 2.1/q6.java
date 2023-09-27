import java.util.*;

public class q6{
    public static void main(String args[]) {
        
        int n, sum=0;
        float avg=0;
        Scanner s= new Scanner(System.in);

        System.out.println("enter the number of elements");
        n = s.nextInt();
        
        int a[] = new int[n];

        System.out.println("enter the elements one by one");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        
        for(int i=0;i<n;i++){
            sum = sum + a[i];
        }
        
        avg = (sum)/n;
        System.out.println("The average of these numbers is "+avg);
    }
}