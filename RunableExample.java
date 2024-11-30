
class MyRunnable implements Runnable {
    public void run(){
        System.out.println("Runnable thread is running: "+ Thread.currentThread().getName());
    }
}


public class RunableExample {
   public static void main(String[] args) {
    MyRunnable myRunnable=new MyRunnable();
    Thread t1=new Thread(myRunnable);
    Thread t2=new Thread(myRunnable);
    t1.setName("Runnable Thread 1");
    t2.setName("Runnable Thread 2");
    t1.start();
    t2.start();
   } 
}
