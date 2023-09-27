//public class A{
    // class A is public, should be declared in a file named A.java
if class A is public it shows the above error


    class A{
    public int data = 40;
   public void msg(){
        System.out.println("Hi Im A");
    }
}

class q2{
    public static void main(String args[]) {
        A a = new A();
        a.msg();
        System.out.println(a.data);
    }
}