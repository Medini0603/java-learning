class point2d{
    int x,y;

    //default initialization
    point2d(){
        x=0;
        y=0;
    }

    //initialization at main
    point2d(int x,int y){
        this.x=x;
        this.y=y;
    }

    void display(){
        System.out.println("(x,y) = ("+ x+", "+y+")");
    }
}

class point3d extends point2d{
    int z;

    //default initialization
    point3d(){
        super();
        z=0;
    }

    //initialization at main
    point3d(int x,int y,int z){
        super(x,y);
        this.z=z;
    }

    //overriding method display
    void display(){
        System.out.println("(x,y,z) = ("+ x+", "+y+", "+z+")");
    }
}

class q11{
    public static void main(String args[]) {
        point2d p1 = new point2d();
        point3d p2 = new point3d(56,7,6);
        p1.display();
        p2.display();
        p1=p2;
        p1.display();
    }
}