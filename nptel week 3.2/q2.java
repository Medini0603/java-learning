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

class q2{
    public static void main(String args[]) {
        box b1 = new box(1,2,5);
        weightbox b2 = new weightbox(10,89,7,5);
        b1.volume();
        b2.volume();

    }
}