package C04;
import java.util.*;

class Q16{
    HashSet s1 = new HashSet();
    HashSet s2 = new HashSet();

    public Q16(HashSet s1, HashSet s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    void check(){
        if(s1.equals(s2)){
            System.out.println("The Two Hash Sets are Equal");
        }
        else{
            System.out.println("The Two Hash Sets are Not Equal");
        }
    }
}

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet s1 = new HashSet();
        HashSet s2 = new HashSet();

        System.out.println("How many elements to enter in Hash 1?");
        int n1 = sc.nextInt();
        for(int i = 0; i<n1; i++){
            System.out.printf("Enter the element %d: ",i+1);
            s1.add(sc.nextInt());
        }

        System.out.println("How many elements to enter in Hash 2?");
        int n2 = sc.nextInt();
        for(int i = 0; i<n2; i++){
            System.out.printf("Enter the element %d: ",i+1);
            s2.add(sc.nextInt());
        }


        Q16 obj = new Q16(s1,s2);
        obj.check();
    }
}
