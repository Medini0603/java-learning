class A{
    int i;
    private int j;
    void ij(int x, int y){
        i=x;
        j=y;
}
}

class B extends A{
    int total;
    void sum(){
        total = (i+j);//throws error
    }
}
// j has private access in A
//         total = (i+j);
//                    ^

class q13{
    public static void main(String args[]) {
        B obj = new B();//compile time error as constructor is private
        obj.ij(2,3);
        System.out.println("i, j = "+obj.i+", "+obj.j);
        obj.sum();
        System.out.println("The sum is " + obj.total);
    }
}