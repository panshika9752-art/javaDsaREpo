public class Average {
public static double Avg(int [] arr){
    int n = arr.length;
    int Sum=0;
    double avg;
    for(int i=0;i<n;i++){
      Sum = Sum + arr[i];
    }
    avg=(double)Sum/n;
    return avg;
}
public static void main(String args[] ){
    int a[] = {1,2,3,4,5};
    double Ans = Avg(a);
    System.out.println(Ans);
}

    
}
