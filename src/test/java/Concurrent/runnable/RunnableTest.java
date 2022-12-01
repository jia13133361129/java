package Concurrent.runnable;

/**
 * @Author: jia
 * Time: 2022/11/30  9:38
 * Description:
 * Version:
 */
public class RunnableTest {
    static class Window1 implements Runnable{

        private int ticket = 100;

        @Override
        public void run() {
            while(true){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }


    public static class WindowTest1 {
        public static void main(String[] args) {
            Window1 w = new Window1();

            Thread t1 = new Thread(w);
            Thread t2 = new Thread(w);
            Thread t3 = new Thread(w);

            t1.setName("窗口1");
            t2.setName("窗口2");
            t3.setName("窗口3");

            t1.start();
            t2.start();
            t3.start();
        }

    }
}
