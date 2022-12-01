package Concurrent.Callable;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Author: jia
 * Time: 2022/11/30  10:27
 * Description:
 * Version:
 */
public class CallableTest {
    //Callable实现多线程
    static class MyThread implements Callable<String> {//线程的主体类

        @Override
        public String call() throws Exception {
            for (int x = 0; x < 10; x++) {
                System.out.println("*******线程执行，x=" + x + "********");
            }
            return "线程执行完毕";
        }
    }

    public static class Demo1 {
        public static void main(String[] args) throws Exception {
            FutureTask<String> task = new FutureTask<>(new MyThread());
            new Thread(task).start();
            System.out.println("线程返回数据" + task.get());

        }
    }
}
