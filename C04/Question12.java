package C04;
import java.util.*;

class Q12{
    Scanner sc = new Scanner(System.in);
    Stack stk = new Stack();
    public Q12(Stack stk) {
        this.stk = stk;
    }

    void push(){
        System.out.println("Enter the element to push: ");
        int item = sc.nextInt();
        stk.push(item);
        System.out.println("Elements in the stack:");
        int size = stk.size();
        for(int i = size-1; i>=0; i--){
            System.out.println(stk.get(i));
        }
    }

    void pop(){
        if(stk.isEmpty()){
            System.out.println("Stack Underflow!!");
        }
        else{
            System.out.println("Enter the position to delete (Starting from 0)");
            int pos = sc.nextInt();
            if(pos>=stk.size()){
                System.out.println("Invalid Position!!");
            }
            else {
                stk.remove(pos);
            }
            System.out.println("Elements in the stack:");
            int size = stk.size();
            for(int i = size-1; i>=0; i--){
                System.out.println(stk.get(i));
            }
        }
    }

    void empty(){
        if(stk.isEmpty()){
            System.out.println("The stack is already empty!");
        }
        else{
            stk.clear();
            System.out.println("The elements have been cleared!!");
        }
    }

    void display(){
        if(stk.isEmpty()){
            System.out.println("Stack is Empty !");
        }
        else {
            System.out.println("Elements in the stack:");
            int size = stk.size();
            for(int i = size-1; i>=0; i--){
                System.out.println(stk.get(i));
            }
        }
    }
}

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack();
        Q12 stkk = new Q12(stk);
        int choice;

        do {
            System.out.println("Enter the choice:");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Empty the Stack");
            System.out.println("4.Display the Stack");
            System.out.println("0.Exit the Stack");
            choice = sc.nextInt();


            switch(choice){
                case 1 : stkk.push();
                    break;
                case 2 : stkk.pop();
                    break;
                case 3 : stkk.empty();
                break;
                case 4 : stkk.display();
                    break;
                case 0 :
                    System.out.println("Exiting...!!!");
                    break;
                default:
                    System.out.println("Invalid Choice!!");
            }
        }while(choice != 0);


    }
}
