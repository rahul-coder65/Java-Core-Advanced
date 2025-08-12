import java.util.ArrayList;
import java.util.List;

public class ListDemo{
    public static void main(String args[]){
        List<Integer> nums = new ArrayList <Integer> ();
        nums.add(2);
        nums.add(2);
        nums.add(4);
        nums.add(5);
        nums.add(2);
        System.out.println(nums.indexOf(7));
        System.out.println(nums.lastIndexOf(2));
         for(int i=0;i<nums.size();i++){
            
            System.out.println(nums.get(i));
        }
    }
}