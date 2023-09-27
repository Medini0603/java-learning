class bike{
    void run(){
        System.out.println("Bike is running");
    }
}

class honda extends bike{
    void run(){
        System.out.println("Honda running safely at 60 kmph");
    }
}

class q7{
    public static void main(String args[]) {
        honda b1 = new honda();
        bike b2 = new bike();
        bike b3 = new honda();
bike b4=b3;
b4.run();
b4=b2;
b4.run();
        b1.run();
        b2.run();
        b3.run();
    }
}