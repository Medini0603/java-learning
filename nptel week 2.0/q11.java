class circle{
    double x,y,r;

    circle(double x,double y,double r){
        this.x=x; this.y=y; this.r=r;
    }
    
    circle(double r){
        x=0; y=0; this.r=r;
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

    // void display(){
    //     System.out.println("Circumference --> " + circumference + "Area" + area);
    // }
}

class q11{
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

        // c1.display();
        // c2.display();
        // c3.display();
        // c4.display();

    }
}