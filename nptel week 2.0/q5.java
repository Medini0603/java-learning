class point{
    int x,y;

    void setpoint(){
        x=1;
        y=3;
    }
}
class q5{
    public static void main(String args[]){
        point p = new point();
        //p.x=1;p.y=3;

        //now we shouuld call method setpoint to define x and y of our object p
        p.setpoint();
        System.out.println("X coordinate = "+p.x);
        System.out.println("Y coordinate = "+p.y);
    }
}