class a{
    void display(){
        System.out.println("Hi i'm A");
    }
}

class b extends a{
    void display(){
        System.out.println("Hi i'm B");
    }
}

class q8{
    public static void main(String args[]) {
        a x = new b();
        b y = new b();

        x.display();
        y.display();
    }
}