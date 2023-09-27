public class equalseg {
    public static void main(String args[]) {
        StringBuffer sb1 = new StringBuffer("Medini");
        StringBuffer sb2 = new StringBuffer("Medini");

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.toString().equals(sb2.toString()));
        System.out.println(sb1.append(" idiot"));
    }
}
