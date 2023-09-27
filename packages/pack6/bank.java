import mypack.balance;

class savings extends balance {
    String branch;
    int id;

    savings(String s, double bal, String b, int id) {
        super(s, bal);
        branch = b;
        this.id = id;

    }

     public void show() {
        if (bal < 0) {
            System.out.println("Name : " + s +"branch : "+branch+" id :  "+id+ " Balance : Negative balance");
        }
        System.out.println("Name : " + s +"branch : "+branch+" id :  "+id+ " Balance : " + bal);
    }
}

public class bank {
    public static void main(String args[]) {
        savings b[] = new savings[3];
        b[0] = new savings("Medini", 1000000,"mysore",121);
        b[1] = new savings("Sannidhi", 1000000,"Hassan",21);
        b[2] = new savings("idiot", -123,"mars",-1);

        for (int i = 0; i < 3; i++)
            b[i].show();
    }
}
