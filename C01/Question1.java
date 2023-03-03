package newPackage;
import java.util.Scanner;

class product{
    int pcode;
    String pname;
    int price;
}
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();

        System.out.println("Enter the Code, Name and Price of the first product:");
        p1.pcode = sc.nextInt();
        p1.pname = sc.next();
        p1.price = sc.nextInt();

        System.out.println("Enter the Code, Name and Price of the second product:");
        p2.pcode = sc.nextInt();
        p2.pname = sc.next();
        p2.price = sc.nextInt();

        System.out.println("Enter the Code, Name and Price of the third product:");
        p3.pcode = sc.nextInt();
        p3.pname = sc.next();
        p3.price = sc.nextInt();

        if(p1.price < p2.price && p1.price < p3.price){
            System.out.println("The first product have the lowest price:");
            System.out.println("Code:"+p1.pcode);
            System.out.println("Name:"+p1.pname);
            System.out.println("Price:"+p1.price);
        }
        else if(p2.price < p1.price && p2.price < p3.price){
            System.out.println("The second product have the lowest price:");
            System.out.println("Code:"+p2.pcode);
            System.out.println("Name:"+p2.pname);
            System.out.println("Price:"+p2.price);
        }
        else{
            System.out.println("The third product have the lowest price:");
            System.out.println("Code:"+p3.pcode);
            System.out.println("Name:"+p3.pname);
            System.out.println("Price:"+p3.price);
        }
    }
}
