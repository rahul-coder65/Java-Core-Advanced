import java.util.Scanner;
public class RootClass{
    public static void main(String args[]){

          int d ,  num;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the value of num and d with space \n");
          d = sc.nextInt();
          num = sc.nextInt();
          try{
             int q;
             q = num/d;
             System.out.println(q);
          }catch(Exception e){
            System.out.println("Something went wrong...");
          }
         
          System.out.println("BYE");
    }
}