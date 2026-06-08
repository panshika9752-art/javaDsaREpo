import java.util.*;
public class insert {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int newarr [] =new int[arr.length+1];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a position to insert");
        int pos = sc.nextInt();
        System.out.println("enter a value to insert");
        int value = sc.nextInt();
         for(int i=0;i<arr.length;i++){
            if(i<pos){
             newarr[i]=arr[i];
         }
           else if(i==pos){
               newarr[pos]=value;
               break;
            }
        }
        for(int i=pos;i<arr.length;i++){
            newarr[i+1]=arr[i];
        }
        for(int x:newarr){
            if(x%2==0){
            System.out.println(x);
            }
        }
    }
}
