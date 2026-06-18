public class binarysearch {
    public static void main(String[] args) {
    int arr[] ={1,2,3,4,5,6,7,8,9};
    int lb=0;
    int ub=arr.length-1;
    int element =  7;
    while(lb<=ub){
        int mid = lb+ub/2;
        if(arr[mid]==element){
            System.out.println("element is fount" + element);
        }
        else if(arr[mid]>element){
            ub=mid;
        }
        else{
            lb=mid;
        }
       } 
    
   
    }
}
}
