package C03;
import java.util.Scanner;

class Student{
    int acscore;
    public Student(int acscore) {
        this.acscore = acscore;
    }
}

class Sports extends Student{
    int spscore;
    public Sports(int acscore, int spscore) {
        super(acscore);
        this.spscore = spscore;
    }
}

class Result extends Sports{
    String name;
    public Result(int acscore, int spscore, String name) {
        super(acscore, spscore);
        this.name = name;
    }
    void display(){
        System.out.println("Name of the student: "+name);
        System.out.println("Academic Score: "+acscore);
        System.out.println("Sports Score: "+spscore);
    }
}

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        String name = sc.next();
        System.out.println("Enter the Academic Mark of the student:");
        int acmark = sc.nextInt();
        System.out.println("Enter the Sports Mark of the Student:");
        int spmark = sc.nextInt();
        Result obj = new Result(acmark,spmark,name);
        obj.display();
    }
}
