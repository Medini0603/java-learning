class gcd{
    int m,n;

    int hcf(int m,int n){
         if(m>n) return hcf(n,m);
         if(m==0) return n;
         if(m==n) return m;
         if(m==1) return 1;

        return hcf(m, n%m);
     }
}


class recursion3{
public static void main(String args[]) {
    gcd g = new gcd();
    g.m = Integer.parseInt(args[0]);
    g.n = Integer.parseInt(args[1]);

    System.out.printf("The HCF of %d and %d is %d\n",g.m,g.n,g.hcf(g.m,g.n));
}
}