package newPackage;
class Matrix{
    int[][] mats = new int[3][3];
    void transpose(int[][] mat,int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                mats[i][j] = mat[j][i];
            }
        }
    }
    void display(int[][] mat,int N){
        boolean val = false;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(mats[i][j] != mat[i][j]){
                    val = false;
                    break;
                }
                else{
                    val = true;
                }
            }
        }
        if(val){
            System.out.println("The matrix is symmetric");
        }
        else{
            System.out.println("The matrix is not symmetric");
        }
    }
}
public class Question4 {

    public static void main(String[] args) {
        Matrix res = new Matrix();
        int flag = 0;
        int [][] mat = {{1,3,5},
                        {3,2,4},
                        {5,4,5}};
        int N = mat.length;
        res.transpose(mat,N);
        res.display(mat,N);
    }
}
