class Human{
    private int age ;
    private String name ;

    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
}

public class EncapsulationDemo{
    public static void main(String args[]){
        Human obj = new Human();
        obj.setAge(25);
        obj.setName("Rahul Kumar Singh");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}