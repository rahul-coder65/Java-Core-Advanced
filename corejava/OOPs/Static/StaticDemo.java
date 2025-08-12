class Mobile {
    String brand;
    int price;
    // Static variable call by class name also. recommended to call by class only.
    //Static mean making the varialbe or method a class member not a object member.
    static String name;
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
    static {
        name="Phone";
        System.out.println("In static block");
    }
    public static void show1(Mobile obj)
    {
        // We can't use non-static variable in static method directly 
        System.out.println(obj.brand + " : " + obj.price + " : " + name); 
        System.out.println("In static method"); 
    }
    public Mobile(){
        brand= "";
        price = 200;
        System.out.println("In constructor");
    }
}

public class StaticDemo{
    public static void main(String args[]) throws ClassNotFoundException{
        Mobile obj1 = new Mobile();
    
        // This line is used to load the class so that we can call the static block without instantiated an object.
        // Class.forName("Mobile");
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.show1(obj1);
        
        // Mobile obj2= new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 1700;
        
        // Mobile.name="Phone";
        // obj1.show();
        // obj2.show();
    }
}