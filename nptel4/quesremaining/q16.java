class A{
   public void msg1(){
        System.out.println("Class A-----> method msg1 : PUBLIC");
    }
    private void msg2(){
        System.out.println("Class A-----> method msg2 : PRIVATE");
    }
    protected void msg3(){
        System.out.println("Class A-----> method msg3 : PROTECTED");
    }
}

public class q16 extends A{
    void msg(){
        System.out.println("Class main : WELCOME!!!!");
    }

    
    public void msg1(){
        System.out.println("public is not changed to any other specifier");
    }

    protected void msg2(){
        System.out.println("private is overridden to protected");
    }

    public void msg3(){
        System.out.println("protected is overridden to public");
    }

public static void main(String args[]) {
    A test1 = new A();
   // test1.msg();  because its not defines in superclass A
    test1.msg1();
   // test1.msg2(); because its private
    test1.msg3();

    q16 test = new q16();
    test.msg();
    test.msg1();
    test.msg2();
    test.msg3();

    

}
    
}