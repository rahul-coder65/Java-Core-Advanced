import java.util.Scanner;
class SortingAlgo{
    public void swap(int arr[], int i , int j){
        int t = arr[i] ;
        arr[i] = arr[j];
        arr[j] = t;
    }
    public int[] sortArray(int arr[]){
       
       

       for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length - 1 - i ;j++){
               if(arr[j+ 1] < arr[j]){
                swap(arr, j+1 , j);
               }
           }
       }
       return arr;
        
    }
}
public class BubbleSort{
    public static void main(String args[]){
       int arr[] = new int[10];
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 10 numbers to be sorted... ");
       for(int i=0;i<10;i++){
          arr[i] = sc.nextInt();

       }
       SortingAlgo obj = new SortingAlgo();
       int res[] = obj.sortArray(arr);
       for(int x : res){
          System.out.print(x + " ");
       }
       
    }
}