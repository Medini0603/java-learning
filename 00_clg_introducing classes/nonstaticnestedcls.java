class Outer {
    // Define an inner class within a for loop.
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            Inner inner = new Inner();
            inner.display();
        }
    }

    class Inner {
        int y=10;//local to inner cls
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
    // void showy() {
    //     System.out.println(y); // error, y not known here!
    // }------------------>error becoz outer cant access inners members.....
}

class nonstaticnestedcls {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
