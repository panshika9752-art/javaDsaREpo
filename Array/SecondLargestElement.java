package Array;
import java.util.Scanner;
class SecondLargestElement{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n= sc.nextInt();
        int arr[] = new int [n];
         System.out.println("Enter "+ n +" elements of the array");
        for(int i=0;i<=arr.length-1;i++){
           int element= sc.nextInt();
           arr[i] = element;
        }
        int max =Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            else if ( secondlargest < arr[i] && max!=arr[i]) {
                secondlargest =arr[i];
                
            }
        }
        System.out.println("Maximum element in the is : " + max);
         System.out.println("secondlargest element in the is : " + secondlargest);
    }
}