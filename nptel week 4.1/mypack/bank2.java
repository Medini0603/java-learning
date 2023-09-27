 package mypack;

 public class bank2 {
    public String name;
    public int id;
   public  double balance;

   public  bank2(String n, double b,int i) {
        name = n;
        balance = b;
        id=i;
    }

   public  void show2() {
        if (balance > 0)
            System.out.println("Name "+name+" id = "+id+" Current balance " + balance);
        else
            System.out.println("Name "+name+" id = "+id+" Account is dead");
    }
}
    

