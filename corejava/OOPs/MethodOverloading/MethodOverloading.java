 class Calculator{
        public int add(int a, int b , int c){
            return a + b + c;
        }
        public int add(int a , int b){
            return a + b;
        }
    }
public class MethodOverloading{
   
    public static void main(String args[]){
           Calculator cal = new Calculator();
           int res = cal.add(1,  3);
           System.out.println(res);
    }
}