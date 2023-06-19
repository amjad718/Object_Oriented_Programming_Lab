package C04;
import java.util.*;

class Q17{
    Scanner sc = new Scanner(System.in);
    HashMap<Integer,String> map = new HashMap<Integer,String>();
    public Q17(HashMap<Integer,String> map) {
        this.map = map;
    }

    void add(){
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        System.out.println("Enter the value: ");
        String value = sc.next();
        map.put(key,value);
    }

    void delete(){
        System.out.println("Enter the key to remove it from the map: ");
        int key = sc.nextInt();
        map.remove(key);
    }

    void replace(){
        System.out.println("Enter the key to replace the value: ");
        int key = sc.nextInt();
        System.out.println("Enter the value to replace it with: ");
        String value = sc.next();
        map.replace(key,value);
    }

    void display(){
        System.out.println("Map: ");

        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
    }
}

public class Question17 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        Q17 obj = new Q17(map);
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter the choice:");
            System.out.println("1.Add");
            System.out.println("2.Delete");
            System.out.println("3.Replace");
            System.out.println("4.Display");
            System.out.println("0.Exit");
            choice = sc.nextInt();


            switch(choice){
                case 1 : obj.add();
                    break;
                case 2 : obj.delete();
                    break;
                case 3 : obj.replace();
                    break;
                case 4 : obj.display();
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
