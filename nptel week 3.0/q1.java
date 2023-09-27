class circle{
    static int circlecount = 0;//class variable
    double x,y,r;//instance variable
    circle(double x, double y, double r){
        circlecount++;//1
        this.x=x; this.y=y; this.r=r;}
    circle(double r){
        this(0,0,r);//2 because constructor inside constructor so 2
        circlecount++;//3
    }

    circle(circle c){
        this(c.x, c.y, c.r);//4
        circlecount++;//5
    }

    circle(){
        this(0,0,10);//6
        circlecount++;//7
    }
    
    double circumference(){
        return 2*Math.PI*r;
    }

    double area(){
        return Math.PI*r*r;
    }
}

class q1{
    public static void main(String args[]) {
  circle c1 = new circle(1,1,9);
       System.out.println(c1.circlecount);//1
      circle c2 = new circle(8);
      System.out.println(c2.circlecount);//1+2=3
      circle c3 = new circle(c2);
      System.out.println(c3.circlecount);//3+2=5
      circle c4 = new circle();
      System.out.println(c4.circlecount);//5+2=7

      System.out.println( " c1 " + c1.circlecount +"c2 " + c2.circlecount +
       " c3 " + c3.circlecount + " c4 " + c4.circlecount);
       System.out.println(c2.circlecount);
System.out.println(circle.circlecount);
    }
}