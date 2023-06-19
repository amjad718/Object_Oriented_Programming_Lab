package C04;
import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(3);
        arr.add(7);
        arr.add(1);
        arr.add(9);
        arr.add(6);
        System.out.println(arr);
        int temp;
        int a;
        for(int i=0;i<=arr.size();i++){
            a = arr.get(0);
            if(a > arr.get(i+1)){
                temp = arr.get(i+1);
                arr.set(a,arr.get(i+1));
                arr.set(i+1,temp);
            }
        }
//        arr.set(1,10);
        System.out.println(arr);
    }
}
