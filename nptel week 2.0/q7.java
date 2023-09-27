class point{
    int x,y;

    point(int a,int b){
        x=a;
        y=b;
    }
}
class q7{
    public static void main(String args[]){
        //point p = new point();


        //p.x=1;p.y=3;
        //now we shouuld call method setpoint to define x and y of our object p
        //p.setpoint();

        //now we call setpoint to fix value to x and y of our choice in mains 
        //p.setpoint(1,3);


        //now we put values during declaration only
        point p1=new point(1,3) ;
        point p2=new point(12,35) ;
        System.out.println("X coordinate 1 = "+p1.x);
        System.out.println("Y coordinate 1 = "+p1.y);
        System.out.println("X coordinate 2 = "+p2.x);
        System.out.println("Y coordinate 2 = "+p2.y);
    }
}