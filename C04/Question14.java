package C04;
import java.util.*;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque newdq = new ArrayDeque();
        newdq.addFirst("Amjad");
        newdq.addFirst("Hussain");
        newdq.addFirst(3);
        System.out.println(newdq);
        newdq.addLast("Alappuzha");
        System.out.println(newdq);

        newdq.remove("Amjad");
        System.out.println(newdq);

        newdq.removeFirst();
        System.out.println(newdq);
    }
}
