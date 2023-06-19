package C04;
import java.util.*;

class Q15{
    Scanner sc = new Scanner(System.in);
    LinkedHashSet set = new LinkedHashSet();

    public Q15(LinkedHashSet set) {
        this.set = set;
    }

    void create(){
        System.out.println("How many elements do you want to insert?");
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            System.out.printf("Enter element 1: ",i+1);
            set.add(sc.next());
        }
    }

    void display(){
        System.out.println("Linked Hash Set:");
        System.out.println(set);
    }
}

public class Question15 {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        Q15 obj = new Q15(set);
        obj.create();
        obj.display();
    }
}
