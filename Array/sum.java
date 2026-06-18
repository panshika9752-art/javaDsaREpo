public class sum {
    public static void main(String[] args) {
        int arr[] ={1,2,3,34,3,2};
        int sum=0;
        for(int x : arr){
            if(x%2!=0){
            sum=sum+x;
            }
        }
        System.out.println(sum);
    }
}
