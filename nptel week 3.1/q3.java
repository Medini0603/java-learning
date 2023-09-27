class point2d {
    int x, y;

    void display() {
        System.out.println("(x,y) = (" + x + ", " + y + ")");
    }
}

class point3d extends point2d {
    int z;

    // overriding method display
    void display() {
        System.out.println("(x,y,z) = (" + x + ", " + y + ", " + z + ")");
    }
}

class q3 {
    public static void main(String args[]) {
        point2d p1 = new point2d();
        point3d p2 = new point3d();

        p1.x = 1;
        p1.y = 2;
        p2.x = 0;
        p2.y = 1;
        p2.z = 3;

        p1.display();
        p2.display();

        point2d p3 = (point2d) p2;
        p3.display();
          // though declared as 2d due to typecasting it becomes 3d

        point2d ref = p2;
        ref.display();//----->can be DIRECTLY DONE like this 

        // point3d ref2=(point2d)p1;
        // ref2.display();
       
    }
}