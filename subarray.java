
import java.util.*;
public class subarray{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n=5;
        System.out.println(Arrays.toString(arr));
        for(int i =0;i<=n-1;i++){

            for (int j=i;j<=n-1;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum= sum+arr[k];
                    System.out.print( arr[k]+" ");
                }
                System.out.print(" Sum: " + sum);
                System.out.println();
            }
        }
    }
}