public class Array{
    public static void main(String args[]){
        //both are valid declarations 
        int intArray[];
        // int[] intArray;
        

        //allocating memory to array 
        intArray = new int[10];
        for(int i=0;i<10;i++){
            System.out.println(intArray[i]);
        }
    }
}