import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " numbers seperated with spaces. ");
        for(int i=0;i<size;i++){
            int x = sc.nextInt();
            nums.add(x);
        }
        int cnt = 0;
        System.out.println("Enter the target Sum value");

        int target = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<Integer , Integer>();
        for(int i=0;i<size;i++){
            if(freq.containsKey(target - nums.get(i))) {
                cnt += freq.get(target - nums.get(i));
                
            }
            freq.put(nums.get(i) , freq.getOrDefault(nums.get(i) , 0) + 1);
        }
        System.out.println("Total Pairs " + cnt);
    }
}