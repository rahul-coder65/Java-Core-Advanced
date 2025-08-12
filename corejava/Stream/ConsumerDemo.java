import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerDemo{
    public static void main(String args[]){
        //Method 1 
        // Consumer<Integer> con = new Consumer<Integer> (){
        //      public void accept(Integer n){
        //         System.out.println(n);
        //      }
        // };

        //Method 2 
        // Consumer<Integer> con = n -> System.out.println(n); 
        List<Integer> nums = Arrays.asList(4, 5, 7, 3 , 2 , 6);
        
        // Method 3
        nums.forEach(n -> System.out.println(n));

    }
}