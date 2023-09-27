import mypack.*;

public class bankacc2 {
    public static void main(String args[]) {
        bank2 b[]=new bank2[3];
        b[0]=new bank2("Medini",1000000,121);
        b[1]=new bank2("Sannidhi",10000,21);
        b[2]=new bank2("Radhika",2000,12);

        for(int i=0;i<3;i++)
            b[i].show2();
}
}