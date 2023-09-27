import java.lang.*;
public class insertegs {
    public static void main(String args[]) {
        StringBuffer sb=new StringBuffer("Sannidhi");
        String s="goodgirl";
        sb.insert(sb.length(),s);
        System.out.println(sb);
        sb.insert(sb.length(),s);
        System.out.println(sb);
        sb.insert(0,s);
        System.out.println(sb);

        sb.insert(9,1>2);
        System.out.println(sb);

        sb.insert(sb.length(),'m');
        System.out.println(sb);

       // sb.insert(567,100);----->index out of range
       sb.insert(5,100);
        System.out.println(sb);

        sb.insert(sb.length(),sb.charAt(5));
        System.out.println(sb);
    }
}
