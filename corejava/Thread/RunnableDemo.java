
public class RunnableDemo{
    public static void main(String args[]){
        Runnable obj1 = () -> {
                for(int i=1;i<11;i++){
                    System.out.println("HI " + i);
                    try{
                        Thread.sleep(10);
                    } catch(InterruptedException e){
                        System.out.println("Error in interrupted.." + e);
                    }
                }
            };
      
        Runnable obj2 = () -> {
                for(int i=1;i<11;i++){
                    System.out.println("HELLO " + i);
                    try{
                        Thread.sleep(10);
                    } catch(InterruptedException e){
                        System.out.println("Error in interrupted.." + e);
                    }
                }
            };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2); 
        t1.start();
        t2.start();
    }
}
