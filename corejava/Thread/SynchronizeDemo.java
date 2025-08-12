class Counter{
    int count;
    public synchronized void increament(){
        count++;
    }
}
public class SynchronizeDemo{
    public static void main(String args[]) {
        Counter c = new Counter();
        Runnable obj1 = () -> {
                for(int i=1;i<=1000;i++){
                     c.increament();
                }
            };
        Runnable obj2 =() -> {
                for(int i=1;i<=1000;i++){
                    c.increament();
                }
            };
       
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        try{
        t1.join();
        t2.join();
        } catch(InterruptedException e){
            System.out.println("Error " + e);
        }
        System.out.println(c.count);
    }
}