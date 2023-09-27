class circle{
    double x,y,r;
    
    double circumference(){
        return 2*3.14*r;
    
    }
    double area(){
        return 3.14*r*r;
    }
}
    class q2{
        public static void main(String args[]){
            circle c1 = new circle();
            circle c2 = new circle();
            c1.x=0;
            c1.y=0;
            c1.r=5;
            c2.x=2;
            c2.y=2;
            c2.r=10;
            System.out.println("Circumference 1 "+c1.circumference());
            System.out.println("Area 1 "+c1.area());
            System.out.println("Circumference 2 "+c2.circumference());
            System.out.println("Area 2 "+c2.area());
        }
    
}