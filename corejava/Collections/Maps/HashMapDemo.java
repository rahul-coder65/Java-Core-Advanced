import java.util.Map;
import java.util.HashMap;


// HashMap and HashTable are same but hashtable is synchronized .
public class HashMapDemo{
    public static void main(String args[]){
        Map<String , Integer> hmap = new HashMap<>();

        hmap.put("Rahul" , 67);
        hmap.put("Sunil" , 77);
        hmap.put("Satyam" , 82);
        hmap.put("Akhilesh" ,91); 
        for(String key : hmap.keySet()){
            System.out.println(key + " : " + hmap.get(key));
        }
        System.out.println(hmap.containsKey("Rahul"));
        System.out.println(hmap.containsKey("Rishi"));
        System.out.println(hmap.containsValue(89));
        System.out.println(hmap.containsValue(91));
        System.out.println(hmap);
        hmap.remove("Satyam");
        System.out.println(hmap);
    }
}
1 5 7 -1 5