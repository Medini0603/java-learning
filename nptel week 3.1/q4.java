class animal{
    String color = "White";
}
class dog extends animal{
    String color = "Black";

    void display(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

class q4{
    public static void main(String args[]) {
        dog d =new dog();
        d.display();
    }
}