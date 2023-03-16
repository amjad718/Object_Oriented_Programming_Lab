package C03;
import java.util.*;

class Employee{
    int empid, salary;
    String name, address;

    public Employee(int empid, int salary, String name, String address) {
        this.empid = empid;
        this.salary = salary;
        this.name = name;
        this.address = address;
    }
}

class Teacher extends Employee{
    String department,subject;
    public Teacher(int empid, int salary, String name, String address, String department, String subject) {
        super(empid, salary, name, address);
        this.department = department;
        this.subject = subject;
    }
    void display(){
        System.out.println("Teacher's Id: "+ empid);
        System.out.println("Teacher's Name: "+ name);
        System.out.println("Teacher's Salary: "+ salary);
        System.out.println("Teacher's Address: "+ address);
        System.out.println("Teacher's Department: "+ department);
        System.out.println("Teacher's Subject: "+ subject);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teacher's details you want to enter");
        int n = sc.nextInt();
        Teacher [] obj = new Teacher[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter Teacher "+(i+1)+" Details:");
            System.out.println("Enter the Id");
            int empid = sc.nextInt();
            System.out.println("Enter the name:");
            String name = sc.next();
            System.out.println("Enter the salary: ");
            int salary = sc.nextInt();
            System.out.println("Enter the address: ");
            String address = sc.next();
            System.out.println("Enter the department: ");
            String department = sc.next();
            System.out.println("Enter the subject: ");
            String subject = sc.next();
            obj[i] = new Teacher(empid,salary,name,address,department,subject);
        }
        for(int i=0; i<n; i++){
            System.out.println("Teacher "+(i+1)+" Details:");
            obj[i].display();
            System.out.println(".....................................");
        }
    }
}
