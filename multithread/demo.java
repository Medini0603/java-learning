 class clicker implements Runnable{
    boolean flag = true;
    Thread t;
    long click=0;

   public clicker(int p)
    {
        t=new Thread(this);
        t.setPriority(p);
    }

    public void run()
    {
        while(flag)
            click++;
    }

    public void start()
    {
        t.start();
    }

    public void stop()
    {
        flag=false;
    }
}

class demo
{
    public static void main(String args[])
    {
        Thread t=Thread.currentThread();
        t.setPriority(Thread.MAX_PRIORITY);
        clicker lo=new clicker(Thread.NORM_PRIORITY-1);
        clicker hi=new clicker(Thread.NORM_PRIORITY+1);
        System.out.println("Start");
        lo.start();
        hi.start();

        try{
            Thread.sleep(5);
        }catch(InterruptedException ex){System.out.println("Caught");}

        lo.stop();
        hi.stop();

        // try{
        //     lo.t.join();
        //     hi.t.join();

        // }catch(InterruptedException ex){System.out.println("Caught");}

        System.out.println(lo.click);
        System.out.println(hi.click);
    }
}