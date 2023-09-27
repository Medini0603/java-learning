import java.util.*;

public class q5{
    public static void main(String args[]){
        int n1,n2;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the two numbers you want to compare");
        n1 = m.nextInt();
        n2=m.nextInt();
        if(n1>n2){
            System.out.printf("%d is greater among %d and %d\n",n1,n1,n2);
        }
        else{
            System.out.printf("%d is greater among %d and %d\n",n2,n1,n2);
        }
    }
}