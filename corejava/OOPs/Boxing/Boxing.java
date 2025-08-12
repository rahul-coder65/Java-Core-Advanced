public class Boxing{
    public static void main(String args[]){
        int num1 = 7;
        System.out.println(num1);
        Integer num2 = num1; // auto-boxing 
        System.out.println(num2);
        // int num3 = num2.intValue(); // unboxing
        int num3 = num2; // auto-unboxing
        System.out.println(num3);
        String str = "12";
        int num4 = Integer.parseInt(str);
        System.out.println("Double of " + num4 + " is : " + num4*2);
    }
}