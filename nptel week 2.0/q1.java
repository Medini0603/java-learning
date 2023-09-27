class circle{
    double x,y,r;
    
    //method circumference has ZERO parameters
    double circumference(){
        return 2*3.14*r;
    }

    double area(){
        return 3.14*r*r;
    }
}
class q1{
    public static void main(String args[]){
        circle c = new circle();
        c.x=0;
        c.y=0;
        c.r=5;
        System.out.println("circumference "+c.circumference());
        System.out.println("area "+c.area());
    }
}