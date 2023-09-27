package mypack;

public class bank {
  public  String name;
    int id;
  public  double balance;

   public bank(String n, double b) {
        name = n;
        balance = b;
    }

  public  void show() {
        if (balance > 0)
            System.out.println("Name "+name+" Current balance " + balance);
        else
            System.out.println("Name "+name+" Account is dead");
    }
}