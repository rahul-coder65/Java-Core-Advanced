import java.util.Set;
import java.util.HashSet;
// Set is collection of Unique values only.
// HashSet does not follow the sequence.
public class HashSetDemo{
    public static void main(String args[]){
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(2);
        nums.add(31);
        nums.add(5);
        nums.add(13);
        nums.add(21);
    
    for(int n : nums){
        System.out.println(n);
    }
    }
}