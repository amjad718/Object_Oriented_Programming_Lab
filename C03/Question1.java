package C03;
import java.util.*;

class Area{
    void area(int radius){
        double area = 3.14*radius*radius;
        System.out.println("Area of the circle is: "+area);
    }
    void area(int length, int breadth){
        int area = length * breadth;
        System.out.println("Area of the rectangle is: "+area);
    }
    void area(float base, float height){
        double area = (0.5 * base * height);
        System.out.println("The area of the triangle is: "+area);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();
        int choice;
        do{
            System.out.println("Enter the choice\n1. Area of Circle\n2. Area of Rectangle\n3. Area of Triangle\n0. Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1: {
                    System.out.println("Enter the radius");
                    int radius = sc.nextInt();
                    obj.area(radius);
                }
                break;
                case 2: {
                    System.out.println("Enter the length and breadth");
                    int length = sc.nextInt();
                    int breadth = sc.nextInt();
                    obj.area(length,breadth);
                }
                break;
                case 3: {
                    System.out.println("Enter the base and the height");
                    float base = sc.nextInt();
                    float height = sc.nextInt();
                    obj.area(base,height);
                }
                break;
                case 0:{
                    System.out.println("Exiting...!!!");
                }
                break;
                default:
                    System.out.println("Please Select a valid Choice!!");
                    break;
            }
        }while(choice!=0);
    }
}
