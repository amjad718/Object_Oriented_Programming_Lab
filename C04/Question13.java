package C04;
import java.util.*;

class Q13{
    Scanner sc = new Scanner(System.in);
    PriorityQueue queue = new PriorityQueue<>();

    public Q13(PriorityQueue queue) {
        this.queue = queue;
    }

    void create(){
        System.out.println("How many to add in the queue?");
        int num = sc.nextInt();
        for(int i = 0; i<num; i++){
            System.out.printf("Enter the element %d: ",i+1);
            queue.add(sc.nextInt());
        }
    }

    void display(){
        System.out.println("Elements in the queue");
        System.out.println(queue);
    }
}

public class Question13 {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue<>();
        Q13 que = new Q13(queue);
        que.create();
        que.display();
    }
}
