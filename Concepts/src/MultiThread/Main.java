package MultiThread;

public class Main {
  public static void main(String[] args) {
    System.out.println("Thread :" + Thread.currentThread().getName());
//    MultiThreading runnableObj = new MultiThreading();
//    Thread thread = new Thread(runnableObj);
//    thread.start();
    MultiThreadingUsingThread thr = new MultiThreadingUsingThread();
    thr.start();
//    thr.run();
    System.out.println("Thread in main :" + Thread.currentThread().getName());
  }
}