class animal {
    animal() {
        System.out.println("Hi im animal");
    }

    void eat() {
        System.out.println("Eating");
    }
}

class dog extends animal {
    dog() {
        System.out.println("Hi im dog");
    }

    void eat() {
        System.out.println("eating bone");
    }

    void comeon() {
        super.eat();
        eat();
    }
}

public class q5b {
    public static void main(String args[]) {

        dog d = new dog();
        d.comeon();
    }
}