class circle{
    double x,y,r;

    double circumference(){
        return 2*3.14*r;
    }

    double area(){
        return 3.14*r*r;
    }

    circle(double a, double b,double c){
        x=a;
        y=b;
        r=c;
    }
}
class q8{
    public static void main(String args[]){
        circle c1 = new circle(0,0,5);
        circle c2 = new circle(12,2,8);

        System.out.println("Circumference 1 "+c1.circumference());
        System.out.println("Area 1 "+c1.area());
        System.out.println("Circumference 2 "+c2.circumference());
        System.out.println("Area 2 "+c2.area());
    }
}