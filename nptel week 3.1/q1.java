class point2d{
    int x,y;

    void display(){
        System.out.println("(x,y) = ("+ x+", "+y+")");
    }

    void sum()
    {
        System.out.println("sum of x+y is "+(x+y));
    }
    
}

class point3d extends point2d{
    int z;

    //overriding method display
    void display(){
        System.out.println("(x,y,z) = ("+ x+", "+y+", "+z+")");
        //here x,y,sum is available and also display is available but it is overidden 
    }
}

class q1{
    public static void main(String args[]) {
        point2d p1 = new point2d();
        point3d p2 = new point3d();

        p1.x = 1 ; p1.y = 2;
        p2.x = 0 ; p2.y = 1; p2.z = 3;

        p1.display();
        p2.display();
        p1.sum();
        p2.sum();
    }
}