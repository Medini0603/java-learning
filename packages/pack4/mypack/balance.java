package mypack;

public class balance {
    String s;
    double bal;

    public balance(String s, double bal) {
        this.s = s;
        this.bal = bal;
    }

    public void show() {
        if (bal < 0) {
            System.out.println("Name : " + s + "Balance : Negative balance");
        }
        System.out.println("Name : " + s + "Balance : " + bal);
    }
}