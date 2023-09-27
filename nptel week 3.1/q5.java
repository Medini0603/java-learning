class animal{
    void eat(){
    System.out.println("eating......");
    }
}

class dog extends animal{
    void eat(){
        System.out.println("eating pedigree......");
    }

    void bark(){
        System.out.println("barkingggg..");
    }

    void work(){
        super.eat();
        eat();
        bark();
    }
}

class q5{
    public static void main(String args[]) {
        dog d = new dog();
        d.work();
        d.eat();

        animal a = new animal();
//a.work();  -----> throws error as it is defined in subclass ,, superclass cannot access it
        a.eat();
    }
}