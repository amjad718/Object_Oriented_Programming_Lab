package newPackage;
import java.util.Scanner;

class Result{
    int [][] mat3 = new int [2][2];
    void add(int [][] mat1,int [][] mat2){
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1.length;j++){
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
    }
    void display(){
        System.out.println("The matrix after summation:");
        for(int i=0;i<mat3.length;i++){
            for(int j=0;j<mat3.length;j++){
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] mat1 = new int[2][2];
        int [][] mat2 = new int[2][2];
        System.out.println("Enter the elements of the first matrix");
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1.length;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix");
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2.length;j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        Result res = new Result();
        res.add(mat1,mat2);
        res.display();
    }
}
