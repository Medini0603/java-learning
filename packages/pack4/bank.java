import mypack.balance;
public class bank {
    public static void main(String args[]) {
        balance b[]=new balance[3];
        b[0]=new balance("Medini",1000000);
        b[1]=new balance("Sannidhi",1000000);
        b[2]=new balance("idiot",-123);

        for(int i=0;i<3;i++)
            b[i].show();
    }
}
