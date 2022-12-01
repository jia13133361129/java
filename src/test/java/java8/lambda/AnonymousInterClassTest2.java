package java8.lambda;

import org.junit.Test;

/**
 * @Author: jia
 * Time: 2022/11/25  10:44
 * Description:
 * Version:
 */
public class AnonymousInterClassTest2 {

    public class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("我爱北京天安门");
        }
    }

    @Test
    public void test1() {
        // 等价于：
        // RunnableImpl r1 = new RunnableImpl();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };

        r1.run();
    }
}
