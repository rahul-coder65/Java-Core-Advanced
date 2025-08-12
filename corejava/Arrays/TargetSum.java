
import java.util.Scanner;
public class TargetSum{
    public static void main(String args[]){
        int arr[] = new int[10];
        Scanner sc  = new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the targetSum value ");
        int targetSum = sc.nextInt();
        int s = 0;
        long sum = 0 ;
        outerloop:
        for(int e=0;e<10;e++){
            sum+=arr[e];
            if(sum == targetSum){
                System.out.println(s +1 );
                System.out.println(e + 1);


                break;
            }else if(sum > targetSum ){
                while(sum > targetSum ) {
                    sum-=arr[s];
                    s++;
                    if(sum == targetSum){
                        System.out.println(s +1 + " " + e + 1);
                        break outerloop;
                    }
                }
            }
        }
        
        
    }
}