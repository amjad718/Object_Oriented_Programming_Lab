//Programs to remove all the elements from the linked list.
package C04;
import java.util.*;

public class Question11 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        Iterator itr = list.iterator();

        list.add("Amjad");
        list.add("Shiva");
        list.add("Fayaz");
        list.add("Nidal");
        list.add("Farhan");
        list.add("Jithin");

        System.out.println("List before deleting the elements");
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        for(String i:list){
            System.out.println(i);
        }

        list.removeAll(list);
        System.out.println("List after deleting the elements: ");
        System.out.println(list);
    }
}
