public class MultiThread{
    public static void main(String args[]){
         Company c = new Company();
         Producer p = new Producer(c);
         Consumer com = new Consumer(c);
         p.start();
         com.start();

    }
}