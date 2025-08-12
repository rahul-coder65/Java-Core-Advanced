
class Human {
    private int age;
    private String name;

    public Human(){
        System.out.println("In the constructor");
        name = "Rahul Kumar Singh";
        age = 25;
    }
    public Human(int age , String name){
        this.age = age;
        this.name = name;
    }

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
public class ConstructorDemo{
    public static void main(String args[]){
        Human obj = new Human();
        // obj.setAge(24);
        // obj.setName("Rahul");
        System.out.println(obj.getName() + " : " + obj.getAge());
        Human obj1 = new Human(23, "Rishi Singh");
        System.out.println(obj1.getName() + " : " + obj1.getAge());

    }
}