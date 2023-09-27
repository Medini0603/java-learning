import java.lang.*;//importing entire util package
class calculator{
    double i,x;
    void sqrt()
    {
        x=Math.sqrt(i);
    }
}

class langapi{
     public static void main(String[] args) {
        calculator c= new calculator();
        c.i=20.0;
        c.sqrt();
        System.out.println("Sqrt of " +c.i +" is "+c.x);
    }
}