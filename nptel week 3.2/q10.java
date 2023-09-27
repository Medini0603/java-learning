abstract class base{
    final void fun(){System.out.println("final fun() is called");}
}

class derived extends base{
    derived(){
        System.out.println("Derived constructor is called");
    }

    //super.fun();
  //  fun() in derived cannot override fun() in base
  //BECAUSE-----> The method which is overridden is final 

    // void fun(){
    //     System.out.println("Derived fun() is called");
    // }
}

class q10{
    public static void main(String args[]) {
       base b = new derived();
       b.fun();
    }
}