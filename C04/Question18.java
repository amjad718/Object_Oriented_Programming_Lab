package C04;
import java.util.*;

public class Question18 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("Amjad",4);
        map.put("Shiva",2);
        map.put("Nidal",3);
        map.put("Fayaz",5);
        map.put("Farhan",1);
//        map.put("Athira",null);

        System.out.println(map);

        Map<String,Integer> tmap = new TreeMap();
        tmap.putAll(map);
        System.out.println(tmap);
    }
}
