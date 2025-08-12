import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class SortString{
    public static void main(String args[]){
        List<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Comparator<String> comp = new Comparator<String> (){
            public int compare(String a, String b){
                if( a.length() > b.length()) 
                  return 1 ;
                return -1;
            }
        };
        System.out.println("Enter the size of list ");
        int sz = sc.nextInt();
        System.out.println("Enter the list of students seperared with spaces") ;
        for(int i=0;i<sz;i++){
            String name = sc.next();
            names.add(name);
        }
        Collections.sort(names, comp);
        System.out.println("List of sorted name according to the length of name");
        for(String n : names){
            System.out.print(n + " ");
        } 

    }
}