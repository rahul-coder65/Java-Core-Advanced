import java.util.Scanner;
public class FinallyDemo{
    public static void main(String args[]){
        int num = 0;
         Scanner sc = null;
        try{
            sc = new Scanner(System.in);
            num = sc.nextInt();
            System.out.println(num);
        }
        finally
        {
           System.out.println("BYE");
           sc.close();
        }
}
}