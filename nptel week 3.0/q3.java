class circle{
    double x,y,r;

    //declare method of type circle
    circle(double x, double y, double r){
        this.x=x; this.y=y; this.r=r;
    }
    circle(double r)
    {
        this(0.0,0.0,r);
    }
    circle(circle c){
        this(c.x, c.y, c.r);
    }

    circle(){
        this(0,0,10);
    }

    circle big(circle a){
        if(a.r>r){
            return a;
        }
        else{
            return this;
        }
    }

    static circle big(circle a,circle b){
        if (a.r > b.r)return a;
        else return b;
    }
}

class q3{
    public static void main(String args[]) {
    circle c1 = new circle(2.0);
    circle c2 = new circle(3.0);
    circle c3 = c1.big(c2);//instant meyhod
    circle c4 = circle.big(c1,c2);//static method

    System.out.println("the radius of bigger circle is  " + c3.r);
}
}