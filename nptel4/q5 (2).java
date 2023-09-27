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