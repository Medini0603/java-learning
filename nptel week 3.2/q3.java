class box{
    double l,b,h;

    box(double l,double b,double h){
        this.l =l ;
        this.b = b;
        this.h = h;
    }

    void volume(){
        System.out.println("the volume of box is "+ l*b*h);
    }
}

class weightbox extends box{
    double w;
    weightbox(double l,double b,double h,double w){
    super( l, b, h);
    this.w=w;
    }
}

class q3{
    public static void main(String args[]) {
        // box b1 = new box(1,2,5);
        weightbox b2 = new weightbox(10,89,7,5);
        b2.volume();
        System.out.println("The weight of b2 is "+b2.w);

        box b1 = new box(1,2,3);
        //assign weightbox to box reference

        b1 = b2;
        b1.volume();

        // error: cannot find symbol
        // System.out.println("The weight of b2 is "+b1.w);
        //                                             ^
        // System.out.println("The weight of b1 is "+b1.w);

        //because we have not defined weight in class box
    }
}