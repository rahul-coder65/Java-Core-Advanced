
// An Interface which has only one abstract method.
@FunctionalInterface
interface Abc{
    // String show();
    int add(int a, int b);
}

// This example is for lambda expression
// Lambda expression only works with functionalInterface. 

public class Demo2{
    public static void main(String args[]){
        // Abc obj = new Abc(){
        //    public void show(){
        //     System.out.println("In anonymous class show");
        //    }
        // };

        // Example of lambda expression 
        // Abc obj = () -> "In lambda expression";
        // int a = 3 , b = 4;
        Abc obj = (a , b) -> a + b;
        int a = 3 ;
        int b = 5;
        System.out.println(obj.add(a , b));
    }
}