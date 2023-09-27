abstract class base{
    abstract void fun();
}

class derived extends base{
    void fun(){
        System.out.println("Derived fun() is called");
    }
}

class q7{
    public static void main(String args[]) {
        base a1 = new derived();
        a1.fun();

        derived a2 = new derived();
        a2.fun();

        //base a3 = new base();
        //not valid as we cant create objects of abstract class
    }
}