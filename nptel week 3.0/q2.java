 class circle{
    static int circlecount = 0;//class variable
    public double x,y,r;//instance variable

    public circle(double x, double y, double r){
        this.x=x; this.y=y; this.r=r;
        //circlecount++;
    }

    public circle(double r){
        this(0,0,r);//circlecount=0  because we have not incremented circlecount in 1st constructor
        circlecount++;//1
    }

    public circle(circle c){
        this(c.x, c.y, c.r);//1
        circlecount++;//2
    }

    public circle(){
        this(0,0,10);//2
        circlecount++;//3
    }

    public double circumference(){
        return 2*Math.PI*r;
    }

    public double area(){
        return Math.PI*r*r;
    }
}

public class q2{
    public static void main(String args[]) {
    // circle c1 = new circle(1,1,9);
    //    System.out.println(c1.circlecount);
      
      circle c1 = new circle();
      System.out.println(c1.circlecount);//1
      circle c2 = new circle(8);
      System.out.println(c2.circlecount);//2
      circle c3 = new circle(c1);
      System.out.println(c3.circlecount);//3



      System.out.println("c1 " + c1.circlecount + " c2 " + c2.circlecount +
       " c3 " + c3.circlecount);
      // System.out.println(c2.circlecount);
      System.out.println(circle.circlecount);
    }
}