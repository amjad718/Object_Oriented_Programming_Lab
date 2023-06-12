package C04;
import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        ArrayList arr1 = new ArrayList();
        ArrayList arr2 = new ArrayList();



        arr1.add("Amjad");
        arr1.add("Shiva");
        arr1.add("Fayaz");
        arr1.add("Nidal");
        System.out.println("ArrayList 1 : "+arr1);



        arr2.add("Hussain");
        arr2.add("Krishnan");
        arr2.add("Nijam");
        arr2.add("Basheer");
        System.out.println("ArrayList 2 : "+arr2);



        arr1.addAll(arr2);
        System.out.println("Mixed Array : "+arr1);



        arr1.remove("Nidal");
        System.out.println("Array after removing Nidal : "+arr1);



        System.out.println("Element at the 4th index : "+arr1.get(4));



        arr1.clear();
        System.out.println("Array after clearing the elements: "+arr1);



        System.out.println("If the list is empty? : "+arr1.isEmpty());
    }
}
