class circle{
    double x,y,r;

    double circumference(){
        return 2*3.14*r;
    }

    double area(){
        return 3.14*r*r;
    }
  
}
class box{
    double x,y,z;

    double volume (){
        return x*y*z;
    }
    double area(){
        return (x*y)+(x*z)+(z*y);
    }
}

class q3{
    public static void main(String args[]){
        circle c1 = new circle();
        box b1 = new box();
        circle c2 = new circle();
        box b2 = new box();

        c1.x=0;c1.y=0;c1.r=5;
        b1.x=3;b1.y=10;b1.z=5;
        c2.x=0;c2.y=0;c2.r=10;
        b2.x=3;b2.y=11;b2.z=50;

        System.out.println("Circumference 1 "+c1.circumference());
        System.out.println("area 1 "+c1.area());
        System.out.println("volume 1 "+b1.volume());
        System.out.println("area of box 1 "+b1.area());
        System.out.println("Circumference 2 "+c2.circumference());
        System.out.println("area 2 "+c2.area());
        System.out.println("volume 2 "+b2.volume());
        System.out.println("area of box 2 "+b2.area());
    }
}