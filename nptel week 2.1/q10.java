import java.io.*;
class q10{
    public static void main(String args[]) throws Exception {
        DataInputStream a = new DataInputStream(System.in);
        Float principal = new Float(0);
        Float interest = new Float(0);
        int years = 0;
        String temp;

        System.out.println("Enter value of principal amount");
        System.out.flush();
        temp = a.readLine();
        principal = Float.valueOf(temp);

        System.out.println("Enter value of rate of interest");
        System.out.flush();
        temp = a.readLine();
        interest = Float.valueOf(temp);

        System.out.println("Enter the number of years");
        System.out.flush();
        temp = a.readLine();
        years = Integer.parseInt(temp);

        float SI = principal*interest*years;
        System.out.println("The value of simple interest is "+SI);
    }
}