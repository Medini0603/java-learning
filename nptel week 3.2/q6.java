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


class shippingcost extends weightbox{
    double cost;
    shippingcost(double l,double b,double h,double w,double cost){
        super(l,b,h,w);
        this.cost=cost;
    }
}
class q6{
    public static void main(String args[]) {
       shippingcost b1 = new shippingcost(1,2,5,45,100);
       shippingcost b2 = new shippingcost(10,89,7,5,100);
        b1.volume();
        b2.volume();
        System.out.println("The weight of b1 is "+b1.w);
        System.out.println("The weight of b2 is "+b2.w);
        System.out.println("The shipping charge of b1 is "+b1.cost);
        System.out.println("The shipping charge of b2 is "+b2.cost);


    }
}