import java.lang.*;

public class appendegs {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("medini");
        StringBuffer sb1 = new StringBuffer("whatbro");
        char c[]={'s','a','n','g'};
        String s="Sangeetha";
        sb.append(s);
        System.out.println(sb);
        sb.append(c);
        System.out.println(sb);
        sb.append(c,1,3);
        System.out.println(sb);
        sb.append(1>2);
        System.out.println(sb);
        sb.append('m');
        System.out.println(sb);
        sb.append(121);
        System.out.println(sb);
        sb.append(99.99);
        System.out.println(sb);
        sb.append(sb1);
        System.out.println(sb);
    }
}
