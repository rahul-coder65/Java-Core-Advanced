import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetDemo{
    public static void main(String args[]){
        Set<Integer> nums = new TreeSet<Integer > ();

        nums.add(23);
        nums.add(98);
        nums.add(20);
        nums.add(13);
        nums.add(32);
        Iterator<Integer> values = nums.iterator(); 
        while(values.hasNext())
            System.out.println(values.next());

        for(int n : nums){
            System.out.println(n);
        }
    }
}