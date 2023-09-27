public class overloadingmain {
    public static void main(int a) {
        System.out.println(a);
        //main("medu");
    }

    public static void main(String a[]) {
        System.out.println("main method is invoked");
        main(10);
    }
}
