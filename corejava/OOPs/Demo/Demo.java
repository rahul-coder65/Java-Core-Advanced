package Demo;
import Inheritance.VeryAdvCalc;

public class Demo{
    public static void main(String args[]){
        VeryAdvCalc obj = new VeryAdvCalc();
         System.out.println(obj.add(2, 3));
        System.out.println(obj.sub(9, 3));
        System.out.println(obj.multi(2, 3));
        System.out.println(obj.div(7, 3.1f));
        System.out.println(obj.power(4, 2));

    }
}