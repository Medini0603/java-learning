class circle{
    double x,y,r;

    circle(double x,double y,double r){
        this.x=x; this.y=y; this.r=r;
    }

    //NOTE -- THIS FIRST CONSTRUCTOE CANT BE WRITTEN LIKE THIS IT WON'T WORK 
    // circle(double x,double y,double r){
    //     this(x,y,r);
    // }

    //THE FOLLOWING ARE THE EXAMPLES FOR CONSTRUCTOR INSIDE CONSTRUCTORS USING KEYWORD this...
    
    circle(double r){
        this(0,0,r);
    }

    circle(circle a){
        this(a.x , a.y , a.r);
    }

    circle(){
        this(0,0,10);
    }

    double circumference(){
        return 2*3.14*r;
    }

    double area(){
        return 3.14*r*r;
    }
}

class q14{
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