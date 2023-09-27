import java.util.*;
class fib{
   // int n;

    int fibonac(int n){
        if (n==0) return 0;
       else if (n==1) return 1;
       else return (fibonac(n-1)+fibonac(n-2));
    }
}

class recursion2{
public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    fib f = new fib();
   // f.n = Integer.parseInt(args[0]);
System.out.println("Enter the number");
int count=s.nextInt();
    for(int i=0;i<=count;i++){
        System.out.print(f.fibonac(i)+"  ");
    }

}
}