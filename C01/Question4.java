package newPackage;
import java.util.*;
class Matrix{
    void display(int[][] mat,int N){
        boolean val = true;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(mat[i][j] != mat[j][i]){
                    val = false;
                    break;
                }
            }if(!val)
                break;
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
        Scanner sc =  new Scanner(System.in);
        Matrix res = new Matrix();
        System.out.println("Enter the matrix row or column size(any one):");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter the matrix:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int N = mat.length;
        res.display(mat,N);
    }
}
