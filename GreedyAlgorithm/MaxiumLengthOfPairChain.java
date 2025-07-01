 import java.util.*;
public class MaxiumLengthOfPairChain {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int  n=sc.nextInt();
         int [][] arr=new int [n][2];
         for(int i=0;i<n;i++)
         {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();

         }
        System.out.println(personMeeting(arr));
        
    }
    public static int personMeeting(int [][]arr)
    {
         Arrays.sort(arr, (a,b)->Integer.compare(a[1],b[1]));
        int cnt=1;
        int max=arr[0][1];
        for(int i=1;i<arr.length;i++)
        {
            if(max<=arr[i][0])
            {
                cnt++;
                max=arr[i][1];

            }
          
        }
        return cnt;
    }
}
