import java.util.*;

public class q11list {
    public static void main(String args[]) {
        int sum=0;
        double avg=0.0;
        Scanner s=new Scanner(System.in);
        ArrayList <Integer> arr=new ArrayList <Integer>();
        while(s.hasNextInt())
            arr.add(s.nextInt());
        for(int i=0;i<arr.size();i++)
            sum=sum+arr.get(i);
        avg=((double)sum)/(arr.size());
        System.out.println("Average of list "+avg);

    }
}
