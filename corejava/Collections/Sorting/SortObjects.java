import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student>{
    int age;
    String name ;
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int compareTo(Student that){
        // if(this.age > that.age){
        //     return 1;
        // }
        // return -1;
        if(this.name.length() > that.name.length()) 
           return 1;
        return -1;
    }
    public String toString(){
        return "Student [age=" + this.age + ", name=" + this.name + "]"; 
    }
}
public class SortObjects{
    public static void main(String args[]){
          List<Student> students = new ArrayList<>();
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of list of students");
          int sz = sc.nextInt();
          for(int i=1;i<=sz;i++){
            System.out.println("Enter the age and name of " + i + " student with white spaces");
            int age = sc.nextInt();
            String name = sc.next();
            students.add(new Student(age, name));
          }
          System.out.println("Before Sorting..");
          for(Student student : students){
            System.out.println(student);
          }
          Collections.sort(students);
          System.out.println("After Sorting..");
          for(Student student : students){
            System.out.println(student);
          }

          
    }
}