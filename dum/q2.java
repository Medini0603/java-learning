import java.util.*;

class q2{
    public static void main(String args[]) {
        int i=4;
        double d=4.0;
        String s ="Hackerrank";

        int a;
        double b;
        String c;

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b=scan.nextDouble();
        System.out.flush();
        c=scan.nextLine();

        System.out.println(a+i);
        System.out.printf("%.1f\n",d+b);
        System.out.println(s+c);
    }
}