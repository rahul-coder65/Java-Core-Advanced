
class Laptop{
    double price;
    String model;

    public String toString(){
        return "[ Price = " + this.price + ", model = " + this.model + "]";
    }
}

public class ObjectDemo{
    public static void main(String args[]){
        Laptop obj1 = new Laptop();
        obj1.price = 43000;
        obj1.model = "Lenovo";
        Laptop obj2 = new Laptop();
        obj2.price = 34000;
        obj2.model = "ASUS";
        System.out.println(obj1);
        System.out.println(obj2.toString());
    }
}