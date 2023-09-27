import java.lang.*;

class calculator{
    double i;
    double result = Math.sqrt(i);
}

class q3{
    public static void main(String args[]) {
        calculator a = new calculator();
        //a.i=1;
        a.i= Integer.parseInt(args[0]);
        System.out.println("The square root of " + a.i + " is " +Math.sqrt(a.i));
    }
}