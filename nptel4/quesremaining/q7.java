class A{
    private int data = 40;
   public void msg(){
        System.out.println("Hi Im A  " + data);
    }
}

class q7{
    public static void main(String args[]) {
        A a = new A();
        a.msg();  // here private data is accesed indirectly
       // System.out.println(a.data);  ----> error
    }
}