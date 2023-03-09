package C02;
import java.util.*;

class Employee{
    int eNo;
    int eSalary;
    String eName;
    void addData(int eNo, String eName, int eSalary, int n){
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }
//    void display(int number,String name,int salary, int n){
//        for(int i=0; i<n; i++){
//            System.out.println("Details of Employee "+i+1);
//            System.out.println("Employee Number:"+number);
//            System.out.println("Employee Name:"+name);
//            System.out.println("Salary:"+salary);
//        }
//    }
}


public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employee details to enter");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter the Employee "+i+" details (eNO, eName and eSalary)");
            int num = sc.nextInt();
            String name = sc.next();
            int salary = sc.nextInt();
            emp[i+1].addData(num,name,salary,n);
        }
        System.out.println("Enter the eNo of the employee to find the details:");
        int No = sc.nextInt();

    }
}
