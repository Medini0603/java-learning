//method inside method -----> an example...
class display{
    void m(){
        System.out.println("Hi I'm M");
    }

    void n(){
        System.out.println("Hi I'm N");
        //this.m();
        m();
    }
}
class q12{
    public static void main(String args[]) {
        display a = new display();

        //IMPORTANT NOTE...
        //m a=new m()  ------> not valid as it is a method not class 
        //objects can be defined only using classes in main not using methods and fields
        
        a.n();
        a.m();
    }
}