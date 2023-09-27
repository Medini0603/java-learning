import java.util.*;
class q9{
    public static void main(String args[]) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the value of radius");
        double radius = r.nextDouble();
        double area= radius* radius* Math.PI;
        System.out.println("The area of the circle is "+area);
    }
}