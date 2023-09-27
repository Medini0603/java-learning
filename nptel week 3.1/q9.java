abstract class bike{
  // abstract void run(){}  --->abstract methods cannot have a body
   abstract void run();
}

class honda extends bike{
    void run(){
        System.out.println("Honda running safely at 60 kmph");
    }
}

class q9{
    public static void main(String args[]) {
        honda b1 = new honda();
       // bike b2 = new bike();
        //bike b3 = new honda();  error as we cant create objects of abstarct class

        b1.run();
       
    }
}