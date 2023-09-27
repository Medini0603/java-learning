//import mypack.*;

class bankacc{
    public static void main(String args[]) {
        bank b[]=new bank[3];
        b[0]=new bank("Medini",1000000);
        b[1]=new bank("Sannidhi",10000);
        b[2]=new bank("Radhika",2000);

        for(int i=0;i<3;i++)
            b[i].show();
    }
}