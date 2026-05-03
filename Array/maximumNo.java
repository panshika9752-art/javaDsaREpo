package Array;
 import java.util.Scanner;

public class maximumNo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int max =-1;
        System.out.println("Enter size of the array");
        int n= sc.nextInt();
        int arr[] = new int [n];
         System.out.println("Enter "+ n +" elements of the array");
        for(int i=0;i<=arr.length-1;i++){
           int element= sc.nextInt();
           arr[i] = element;
        }
        for(int i=0;i<=arr.length-1;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the is : " + max);
    }
}

