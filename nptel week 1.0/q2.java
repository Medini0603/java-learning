import java.lang.*;

class q2 {
    public static void main(String[] args) {
        //int a[]=new int[5];
        int a[] = {1,5,8,6,7,9};
        for(int i=0;i<(a.length);i++)
        {
            System.out.print(a[i]+" ");//to print elements of array with space
        }
        // int sum=0; this doesnt give ans
        System.out.println();
        float avg,sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        avg=sum/(a.length);
        System.out.println("The average of the given array is "+ avg);
    }
}
