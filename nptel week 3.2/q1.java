class ij{
    int i,j;
    void display(){
        System.out.printf("i = %d and j = %d\n",i,j);
    }
}

class ijk extends ij{
    int k;
    void display(){
        super.display();
        System.out.printf("k = %d\n",k);
    }

    void sum(){
        System.out.printf("%d + %d + %d = %d\n",i,j,k,(i+j+k));
    }
}

class q1{
    public static void main(String args[]) {
        ijk p = new ijk();
        ij q =new ij();

        p.i = 2;
        p.j = 3;
        p.k = 5;
        p.display();
        p.sum();

        q.i = 2;
        q.j = 9;
        q.display();
    }
}