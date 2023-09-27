class point{
    int x,y;

    void setpoint(int a,int b){
        x=a;
        y=b;
    }
}
class q6{
    public static void main(String args[]){
        point p1 = new point();
        point p2 = new point();
        //p.x=1;p.y=3;
        //now we shouuld call method setpoint to define x and y of our object p
        //p.setpoint();

        //now we call setpoint to fix value to x and y of our choice in mains 
        p1.setpoint(1,3);
        System.out.println("X coordinate 1 = "+p1.x);
        System.out.println("Y coordinate 1 = "+p1.y);
        p2.setpoint(23,30);
        System.out.println("X coordinate 2 = "+p2.x);
        System.out.println("Y coordinate 2 = "+p2.y);
    }
}