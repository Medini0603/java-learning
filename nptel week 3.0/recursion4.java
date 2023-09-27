class hello{
    int n;

    void display(int n){
        if(n==0) return;
        else {
        System.out.println("hello "+ n);
        display(--n);
        System.out.println(n);
        return;
    }
}
}

class recursion4{
    public static void main(String args[]) {
    hello h = new hello();
    h.n = Integer.parseInt(args[0]);

    h.display(h.n);
}
}