class A{
    private A();//private constructor 
   public void msg(){
        System.out.println("Hi Im A");
    }
}

class q9{
    public static void main(String args[]) {
        A a = new A();//compile time error as constructor is private
        a.msg();
    }
}