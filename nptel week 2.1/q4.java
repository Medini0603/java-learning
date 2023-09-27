import java.util.Scanner;

public class q4{
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter number1 ");
        n1 =n.nextInt();
        System.out.println("Enter number2 ");
        n2 =n.nextInt();
        System.out.println("The average of these two numbers is " + (n1+n2)/2);
    }
}