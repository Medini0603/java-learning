class circle{
    static int circlecount = 0;//class variable
    public double x,y,r;//instance variable

    public circle(double x, double y, double r){
        this.x=x; this.y=y; this.r=r;
        circlecount++;
    }

    public circle(double r){
        x=0.0;
        y=0.0;
        this.r=r;
        circlecount++;
    }

    public circle(circle c){
        x=c.x;
        y=c.y;
        r=c.r;
        circlecount++;
    }

    public circle(){
        x=0.0;
        y=0.0;
        r=1.0;
        circlecount++;
    }

    public double circumference(){
        return 2*Math.PI*r;
    }

    public double area(){
        return Math.PI*r*r;
    }
}

public class q2b{
    public static void main(String args[]) {
    circle c4 = new circle(1,1,9);
       System.out.println(c4.circlecount);
      
      circle c1 = new circle();
      System.out.println(c1.circlecount);
      circle c2 = new circle(8);
      System.out.println(c2.circlecount);
      circle c3 = new circle(c1);
      System.out.println(c3.circlecount);



      System.out.println("c1 " + c1.circlecount + " c2 " + c2.circlecount +
       " c3 " + c3.circlecount);
      // System.out.println(c2.circlecount);
      System.out.println(circle.circlecount);
    }
}

