import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Userinput{
    public static void main(String args[]) throws IOException{
    //    Scanner sc = new Scanner(System.in);
    //    Double a = sc.nextDouble();
    //    System.out.println("You have entered "+a);
    //    sc.close();
         InputStreamReader in = new InputStreamReader(System.in);
         BufferedReader bf = new BufferedReader(in);
         int num = Integer.parseInt(bf.readLine());
         System.out.println(num);
         bf.close();
    }
}
