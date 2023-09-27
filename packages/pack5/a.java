//import mypack.*;
//to avoid collision between 2 myclasses of mypack1 and mypack2 we use fully qualified name
class a{
    public static void main(String args[]){
        mypack1.myclass obj1=new mypack1.myclass();
        mypack2.myclass obj2=new mypack2.myclass();
        obj1.disp1();
        obj2.disp2();
    }
}