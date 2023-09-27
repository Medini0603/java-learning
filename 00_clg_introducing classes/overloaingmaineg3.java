public class overloaingmaineg3 {
    // A Java program with overloaded main()
  // Normal main()
  public static void main(String[] args) {
    System.out.println("Hi Geek (from main)");
    overloaingmaineg3.main("Geek");
  }     

  // Overloaded main methods
  public static void main(String arg1) {
    System.out.println("Hi, " + arg1);
    overloaingmaineg3.main("Dear Geek","My Geek");
  }

  public static void main(String arg1, String arg2) {
    System.out.println("Hi, " + arg1 + ", " + arg2);

}
}
