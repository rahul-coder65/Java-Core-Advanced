class Company{
    public int n;
    public boolean f = false;

    
    synchronized public void produce_item(int n) throws Exception{
        if(f){
            wait();
        }
            this.n = n;
            System.out.println("Produced : "  + this.n);
            f = false;
            notify();
    }
    synchronized public int consume_item() throws Exception{
        if(!f){
            wait();
        }
          System.out.println("Consumed : " + this.n);

           f = true;
           notify();
          return this.n;
    }
}