class Calculator{
    // int a ;
    public int add(int b , int c){
        System.out.println("Add");
        return b + c;
    }
}

public class Demo{
    public static void main(String args[]){

        int a = 4 ;
        int b = 3;
        int res ;
        
        Calculator cal = new Calculator();
        res = cal.add( a ,b );

        System.out.println(res);
    }
}