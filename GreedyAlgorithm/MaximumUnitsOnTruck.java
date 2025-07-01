import java.util.Arrays;
import java.util.Scanner;

public class MaximumUnitsOnTruck {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int [][]arr=new int [n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        int size=sc.nextInt();
        System.out.println(maximumUnits(arr ,size));
    }
    public static int maximumUnits(int[][] boxTypes, int truckSize)
    {
         Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int sum=0;
    
        for(int i=0;i<boxTypes.length;i++)
        {
            if(truckSize>0 && truckSize>=boxTypes[i][0])
            {
                 sum+=(boxTypes[i][0]*boxTypes[i][1]);
                 truckSize-=boxTypes[i][0];
            }
            else if(truckSize>0 && truckSize<boxTypes[i][0])
            {
                 sum+=(truckSize*boxTypes[i][1]);
                 return sum;
            }
        }
        return sum;
    }
}
