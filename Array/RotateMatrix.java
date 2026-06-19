 public class RotateMatrix {
 public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i =0;i<n;i++){
            for(int j=i; j<m;j++){
                if(i!=j){
                    int temp =matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i] =temp;
                }
            }
        }
        for(int i =0; i<n;i++){
            int left=0;
            int right =n-1;
            while(left<right){
                int temp =matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
                            }
        }
    }
    public static void main(String[] args) {
        RotateMatrix rm = new RotateMatrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("========================");
        rm.rotate(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}