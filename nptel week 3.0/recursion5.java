class demo{
    int count=0;
    int n;
    void p(){
        
        count++;

        if(count<=n){
        System.out.println("Hello"+count);
        p();
        
    }
}
}

class recursion5{
    public static void main(String args[]) {
        demo h = new demo();
        h.n =Integer.parseInt(args[0]);
        h.p();
    }
}