
enum Laptop{
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;
    private Laptop(){

    }
    private Laptop(int price){
        this.price = price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}

public class LaptopDemo{
    public static void main(String args[]){

       for(Laptop lap : Laptop.values()){
        if(lap == Laptop.Surface ){
            lap.setPrice(1500);
        }
        System.out.println(lap + " : " + lap.getPrice());
       }   
    }
}