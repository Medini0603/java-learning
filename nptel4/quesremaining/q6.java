class A{
    private int data = 40;//accessable only inside class A
   public void msg(){
        System.out.println("Hi Im A");
    }
}

class q6{
    public static void main(String args[]) {
        A a = new A();
        a.msg();
       // System.out.println(a.data);
       //gives error
       //because the data is private
    }
}