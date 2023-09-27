class A{
    int i;
}

class B extends A{
    int i;

    B(int a,int b){
        super.i =a;
        i=b;
    }

    void display(){
        System.out.println("The value of i in super class is "+super.i);
        System.out.println("The value of i in sub class is "+i);
    }
}

class q4{
    public static void main(String args[]) {
        B m = new B(1,2);
        A n = new A();

        m.display();
       // n.display();  error as display() is not in superclass
    }
}