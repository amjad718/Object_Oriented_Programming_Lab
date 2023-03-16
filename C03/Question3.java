package C03;
import java.util.*;

class Person{
    String name, gender, address;
    int age;
    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employeee extends Person{
        int empid, salary;
        String com_name, qualificaiton;
    public Employeee(String name, String gender, String address, int age, int empid, int salary, String com_name, String qualificaiton) {
        super(name, gender, address, age);
        this.empid = empid;
        this.salary = salary;
        this.com_name = com_name;
        this.qualificaiton = qualificaiton;
    }
}

class Teeacher extends Employeee{
    int teacherid;
    String department, subject;
    public Teeacher(String name, String gender, String address, int age, int empid, int salary, String com_name, String qualificaiton, int teacherid, String department, String subject) {
        super(name, gender, address, age, empid, salary, com_name, qualificaiton);
        this.teacherid = teacherid;
        this.department = department;
        this.subject = subject;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Employee Id: "+empid);
        System.out.println("Salary: "+salary);
        System.out.println("Company Name: "+com_name);
        System.out.println("Qualification: "+qualificaiton);
        System.out.println("Teacher Id: "+teacherid);
        System.out.println("Department: "+department);
        System.out.println("Subject: "+subject);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teacher's details you want to enter");
        int n = sc.nextInt();
        Teeacher [] obj = new Teeacher[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter Teacher "+(i+1)+" Details:");
            System.out.println("Enter the name: ");
            String name = sc.next();
            System.out.println("Enter the gender: ");
            String gender = sc.next();
            System.out.println("Enter the address: ");
            String address = sc.next();
            System.out.println("Enter the age: ");
            int age = sc.nextInt();
            System.out.println("Enter the Employee Id: ");
            int empid = sc.nextInt();
            System.out.println("Enter the salary: ");
            int salary = sc.nextInt();
            System.out.println("Enter the Company Name: ");
            String com_name = sc.next();
            System.out.println("Enter the Qualification: ");
            String qualification = sc.next();
            System.out.println("Enter the Teacher Id: ");
            int teacherid = sc.nextInt();
            System.out.println("Enter the department: ");
            String department = sc.next();
            System.out.println("Enter the subject: ");
            String subject = sc.next();
            obj[i] = new Teeacher(name,gender,address,age,empid,salary, com_name, qualification, teacherid, department, subject);
        }
        for(int i=0; i<n; i++){
            System.out.println("Teacher "+(i+1)+" Details:");
            obj[i].display();
            System.out.println(".....................................");
        }
    }
}
