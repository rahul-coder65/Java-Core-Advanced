class A{
    public void show() throws ClassNotFoundException{
       
            Class.forName("ThrowsDem");
      
    }
}

public class ThrowsDemo{
    static{
        System.out.println("Class laoded...");
    }
    public static void main(String args[]){
        A obj = new A();
        try{
        obj.show();
        }catch(ClassNotFoundException e){
           System.out.println("Class name not found " + e);
        }
    }
}