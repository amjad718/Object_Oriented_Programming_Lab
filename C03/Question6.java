package C03;
import java.util.*;

interface Prototypes{
    void area();
    void perimeter();
}

class Circle implements Prototypes{
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public void area(){
        System.out.println("The area of the circle is: "+(3.14*radius*radius));
    }
    public void perimeter(){
        System.out.println("The circumference of the circle is: "+(2*3.14*radius));
    }
}

class Rectangle implements Prototypes{
    int length, breadth;
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void area(){
        System.out.println("The area of the rectangle is: "+(length*breadth));
    }
    public void perimeter(){
        System.out.println("The perimeter of the rectangle is: "+(2*(length+breadth)));
    }
}

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter the choice:\n1) Area & Perimeter of Circle\n2) Area & Perimeter of Rectangle");
            choice = sc.nextInt();
            switch(choice){
                case 1: {
                    System.out.println("Enter the radius of the circle: ");
                    int radius = sc.nextInt();
                    Circle circle = new Circle(radius);
                    circle.area();
                    circle.perimeter();
                    break;
                }
                case 2: {
                    System.out.println("Enter the length and breadth of the rectangle");
                    int length = sc.nextInt();
                    int breadth = sc.nextInt();
                    Rectangle rectangle = new Rectangle(length,breadth);
                    rectangle.area();
                    rectangle.perimeter();
                    break;
                }
                case 0: {
                    System.out.println("Exiting....!!!!");
                } break;
                default: {
                    System.out.println("Invalid Statement!");
                }
                break;
            }
        }while(choice!=0);
    }

}
