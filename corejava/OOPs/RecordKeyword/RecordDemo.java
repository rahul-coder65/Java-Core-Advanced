


// instance variable of this class is by default private and final .
// This class can't extend another class 
// Record class cant record class only.
// We can implement as many as interfaces we want to implement.
record Student(int id , String name){
    // This is one way of defining constructor 
    // public Student(int id ,String name){
    //     this.id = id;
    //     this.name = name;
    // }


    // Another way of defining constructor for the record 
    
    public Student{
        if(id == 0){
            throw new IllegalArgumentException("id Can't be zero");
        }
    }
}

public class RecordDemo{
    public static void main(String args[]){
        Student a1 = new Student(1 , "Rahul");
        Student a2 = new Student(2 , "Rishi");
        Student a3 = new Student(1 , "Rahul");
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        System.out.println(a1.name());
    }
}