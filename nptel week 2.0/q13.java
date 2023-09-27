//constructor inside constructor -----> an example...

class A{
    A(){
    this(5);
    System.out.println("This is constructor ");
}
    A(int x){
        System.out.println("This is constructor with parameter  "+ x);
    }
}    

class q13{
    public static void main(String args[]) {
        A m1 = new A();

        A m2 = new A(10);
    }
    
}