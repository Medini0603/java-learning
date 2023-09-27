class Hello{
    int n;
    void printing(int n)
    {
        if(n==0)
        return;

        else{
            System.out.println(n+" Hello");
            n--;
            printing(n);
        }
    }
}

public class recursion6 {
    public static void main(String args[]) {
        Hello h=new Hello();
        h.n=10;
        h.printing(h.n);
    }
}
