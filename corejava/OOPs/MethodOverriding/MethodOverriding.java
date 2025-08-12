class Calc{
    public int add(int a, int b){
        return a + b;
    }
}
class AdvCalc extends Calc{
    @Override
    public int add(int a ,int b){
        return a + b + 1;
    }
}
public class MethodOverriding{
    public static void main(String args[]){
         AdvCalc obj = new AdvCalc();
            System.out.println(obj.add(3, 4));
    }
 
   
}