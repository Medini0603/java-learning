abstract class base{
    base(){
        System.out.println("Base constructor is called");
    }
    abstract void fun();
}

class derived extends base{
    derived(){
       //super(); ---> even if its called or not it prints base constructor
        System.out.println("Derived constructor is called");
    }

    void fun(){
        System.out.println("Derived fun() is called");
    }
}

class q8{
    public static void main(String args[]) {
        base a1 = new derived();
        a1.fun();

        derived a2 = new derived();
        a2.fun();
        
        //base a3 = new base();
        //not valid as we cant create objects of abstract class
    }
}