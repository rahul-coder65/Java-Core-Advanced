import java.util.Collection;
import java.util.ArrayList;
public class CollectionDemo{
    public static void main(String args[]){
     /* This section is for object type collection ArrayList.  
        Collection nums = new ArrayList();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add("Nums"); 
        for(Object n : nums){
            System.out.println(Integer.parseInt(n));
        } */
        Collection <Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6); 
        for(int i=0;i<nums.length;i++){
            System.out.println(nums.get(i));
        }
    }
}