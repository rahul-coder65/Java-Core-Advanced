import java.util.Scanner;

class MyException extends Exception {

    public MyException(String message){
        super(message);
    }

}
public class MultiCatch{
    public static void main(String args[]){

          int d ,  num;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the value of num and d with space \n");
          d = sc.nextInt();
          num = sc.nextInt();
          int arr[] = new int[5];
          try{
             int q;
             q = num/d;
             if(q==0) {
                throw new MyException("I don't want to print zero.");
             }
             System.out.println(q);
             System.out.println(arr[0]);
             System.out.println(arr[2]);
             
          }
          catch(MyException e){
            System.out.println("quotient is zero " + e);
          }
          catch( ArithmeticException e){
            System.out.println("Cannot devide by zero ");
          } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index must be between 0 and 4");
          } catch( Exception e){
            System.out.println("Something went wrong");
          }
         
          System.out.println("BYE");
    }
}