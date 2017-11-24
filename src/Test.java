import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName£º
 * Description£º
 * <p>company£º58Í¬³Ç <br>
 * Copyright£ºCopyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2017/11/20 15:23
 * @since JRE 1.6.0_22  or higher
 */
public class Test implements Runnable{
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
//    private Condition condition2 = lock.newCondition();
    private int count = 1;
    public void run(){
        new Thread(new Thread1(),"1").start();
        new Thread(new Thead2(),"2").start();
    }

    class Thread1 implements Runnable {
        public void run(){
            while (true){
                try {
                    lock.lock();
                    while (count !=1){
                        condition1.await();
                    }
                    System.out.println("1");
                    Thread.sleep(1000);
                    count = 2;
                    condition1.signal();
                }catch (Exception e){
                    e.printStackTrace();
                }finally{
                    lock.unlock();
                }
            }
        }
    }

    class Thead2 implements Runnable{
        public void  run(){
            while (true){
                try {
                    lock.lock();
                    while (count !=2){
                        condition1.await();
                    }
                    System.out.println("2");
                    Thread.sleep(1000);
                    count = 1;
                    condition1.signal();
                }catch (Exception e){
                    e.printStackTrace();
                }finally{
                    lock.unlock();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Test(),"a").start();
    }
}