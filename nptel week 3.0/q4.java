class circle{
    static double x,y,r;

    circle(double r)
    {
        this.r=r;
    }

//following is the nested class
    static class point{
        double x,y;
        void display(){
            System.out.println("(x , y) : (" + x + ", " + y + ")");
        }

        point(double a, double b){
            x = a;
            y = b;
        }
    }  
  //following is the method of class circle......  
     boolean isinside(point p)
    {
        double dx = p.x ;
        double dy = p.y ;
        double distance = Math.sqrt((dx*dx)+(dy*dy));

        if(distance<r) return true;
        else return false;
    }

    //main method is also defined inside class circle
    //therefore circle becomes main class
    public static void main(String args[]) {
        circle a = new circle(2);
        point pa = new point(1,2);
        pa.display();
        System.out.println("the point (1,2) is inside the circle of radius 2 - "+a.isinside(pa));
        circle b = new circle(1);
        point pb = new point(3,3);
        pb.display();
        System.out.println("the point (3,3) is inside the circle of radius 1 - "+b.isinside(pb));
    }
}
