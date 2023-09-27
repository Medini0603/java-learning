// Use an array to pass a variable number of
// arguments to a method. This is the old-style
// approach to variable-length arguments.
class varargs {
    static void vaTest(int v[]) {
        System.out.print("Number of args: " + v.length +
                " Contents: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        // Notice how an array must be created to
        // hold the arguments.
        int n1[] = { 10 };
        int n2[] = { 1, 2, 3 };
        int n3[] = {};
      //  varargs obj=new varargs();
        /*obj.*/vaTest(n1); // 1 arg
        /*obj.*/vaTest(n2); // 3 args
        /*obj.*/vaTest(n3);
    }
}