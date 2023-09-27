import java.lang.*;

public class q4 {
    public static void main(String[] args) {
        int a[][][]=new int[3][4][5];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<5;k++)
                {
                    a[i][j][k]=(i+1)*(j+1)*(k+1);
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<5;k++)
                {
                   System.out.print(a[i][j][k]+" ");//note for to print values "" is not required but to print whats in the bracket we must use ""

                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
