class A extends Thread{
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println("HI " + i);
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
                System.out.println("Error in interrupted.." + e);
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println("HELLO " + i);
            try{
                Thread.sleep(50);
            } catch(InterruptedException e){
                System.out.println("Error in interrupted.." + e);
            }
        }
    }
}

public class ThreadDemo{
    public static void main(String args[]){
         A a = new A();
         B b = new B();
         a.setPriority(2);
         b.setPriority(1);
         a.start();
         try{
            Thread.sleep(5);
         }catch(InterruptedException e){
            System.out.println("Interrupted Exception error" + e);
         }
         b.start();
        //  System.out.println(a.getPriority());
    }
}