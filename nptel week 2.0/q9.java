class circle{
    double x,y,r;

    circle(double a,double b,double c){
        x=a; y=b; r=c;
    }
    
    circle(double c){
        x=0; y=0; r=c;
    }

    circle(circle a){
        x=a.x; y=a.y; r=a.r;
    }

    circle(){
        x=0; y=0; r=1;
    }

    double circumference(){
        return 2*3.14*r;
    }

    double area(){
        return 3.14*r*r;
    }
}

class q9{
    public static void main(String args[]){
        circle c1= new circle(1,2,23);
        circle c2 = new circle(5);
        circle c3 = new circle(c1);
        circle c4 = new circle();

        System.out.println("Circumferenece 1 = "+c1.circumference());
        System.out.println("Area 1 = "+c1.area());

        System.out.println("Circumferenece 2 = "+c2.circumference());
        System.out.println("Area 2 = "+c2.area());

        System.out.println("Circumferenece 3 = "+c3.circumference());
        System.out.println("Area 3 = "+c3.area());

        System.out.println("Circumferenece 4 = "+c4.circumference());
        System.out.println("Area 4 = "+c4.area());

    }
}