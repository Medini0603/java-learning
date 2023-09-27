import java.lang.*;

class buffereg {
    public static void main(String args[]) {
        // non mutable strings examples

        String s = "micro";
        s.concat("soft");
        System.out.println(s);
        s=s.concat("soft");
        System.out.println(s);

        // redecalring string

        s = "Tom";
        s.concat("Cat");
        System.out.println(s);
        s=s.concat("Cat");
        System.out.println(s);

        // using StringBuffer
        StringBuffer sb = new StringBuffer("micro");
        sb.append("soft");
        System.out.println(sb);
    }
}