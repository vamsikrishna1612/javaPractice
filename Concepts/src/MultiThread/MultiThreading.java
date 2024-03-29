package MultiThread;

public class MultiThreading implements Runnable{
  @Override
  public void run(){
    System.out.println("thread using runnable interface:" + Thread.currentThread().getName());
  }
}
