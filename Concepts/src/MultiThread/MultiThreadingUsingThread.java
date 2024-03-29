package MultiThread;

public class MultiThreadingUsingThread extends Thread {
  @Override
  public void run(){
    System.out.println("Thread using Thread class:" + Thread.currentThread().getName());
  }
}
