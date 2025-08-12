import java.util.Scanner;
public class StringClass{
    public static void main(String args[]){
        
        // // String name = new String("Rahul");
        // // String name = "Rahul";
        // String name;
        // Scanner sc = new Scanner(System.in);
        // // name = sc.next();
        // name = sc.nextLine();
        // // System.out.println(name.concat("Singh"));
        // System.out.println(name + name.length());
        
        // sc.close();
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());
        sb.append(" Singh");
        System.out.println(sb);
        String srt = sb.toString();
    }
}