abstract class base{
     void fun(){
        System.out.println("Base fun() is called");
     };
}

class derived extends base{
    derived(){
        System.out.println("Derived constructor is called");
       
    }

    void fun(){
        super.fun();
        System.out.println("Derived fun() is called");
        
    }
}

class q9{
    public static void main(String args[]) {
        base a1 = new derived();
        a1.fun();
        //a1.this.fun();  -----> error because we cant create objects for abstrsct class

        derived a2 = new derived();
        a2.fun();

        //super.fun();
//not possible as main is not a subclass of abstract class base

        //base a3 = new base();
        //not valid as we cant create objects of abstract class
    }
}