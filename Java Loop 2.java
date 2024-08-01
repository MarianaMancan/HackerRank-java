import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double sum=0;
            int sum0=0;
            for(int j=0;j<n;j++)
            {
                for(int k=j;k>=0;k--)
                {
                sum=sum+(Math.pow(2,k)*b);
                }
                sum=sum+a;
                sum0=(int)sum;
                System.out.print(sum0+" ");
                sum=0;
            }
            System.out.println();
        }
        in.close();
    }
}
