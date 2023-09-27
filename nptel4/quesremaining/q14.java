class A{
    int i;
    protected int j;
    void ij(int x, int y){
        i=x;
        j=y;
}
}

class B extends A{
    int total;
    void sum(){
        total = (i+j);// not throw error because j is protected and B a subclass of A can access it
    }
}
                 

class q14{
    public static void main(String args[]) {
        B obj = new B();//compile time error as constructor is private
        obj.ij(2,3);
        System.out.println("i, j = "+obj.i+", "+obj.j);
        obj.sum();
        System.out.println("The sum is " + obj.total);
    }
}