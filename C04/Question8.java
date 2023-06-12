package C04;
import java.util.*;

class StackProgram{
    public void func() {
        Stack<String> stk = new Stack<String>();
        Iterator itr = stk.iterator();
        stk.push("Amjad");
        stk.push("Shiva");
        stk.push("Fayaz");
        stk.push("Nidal");

        System.out.println("Stack after pushing elements: ");
        for (String i : stk){
            System.out.println(i);
        }

//        while(itr.hasNext()){
//            System.out.println(stk.pop());
//        }

        stk.pop();
        stk.pop();
//
        System.out.println("Stack after popping two times: ");
        for (String i : stk){
            System.out.println(i);
        }
    }
}

public class Question8 {
    public static void main(String[] args) {
        StackProgram newstk = new StackProgram();
        newstk.func();
    }
}
