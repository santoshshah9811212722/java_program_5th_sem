

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running: "+Thread.currentThread().getName());
    }
}

public class ThreadExample {
    public static void main(String[] args){
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.setName("MyThread 1");
        t2.setName("MyThread 2");
        t1.start();
        t2.start();
    }
    
}
