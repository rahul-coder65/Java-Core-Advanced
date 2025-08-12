import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
public class SortArray{
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<>();
        Comparator<Integer> comp = new Comparator<Integer>(){
             public int compare(Integer i , Integer j){
                if(i%10 > j%10) 
                   return 1;
                return -1;
             }
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " numbers seperated with spaces.");
        for(int i=0;i<size;i++){
            int x = sc.nextInt();
            nums.add(x);
        }
        Collections.sort(nums, comp);
        System.out.println("Sorted array is");
        for(int x : nums){
           System.out.print(x + " ");
        }
    }
}