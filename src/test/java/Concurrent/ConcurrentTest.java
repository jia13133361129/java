package Concurrent;

/**
 * @Author: jia
 * Time: 2022/11/30  9:30
 * Description:
 * Version:
 */
public class ConcurrentTest {
    public static void main(String[] args) {
        MyData03 myData03 = new MyData03();

        for (int i = 0; i < 20; i++) {
            new Thread(() ->{
                for (int j = 0; j < 1000; j++) {
                    myData03.increment();
                }
            },"线程" + String.valueOf(i)).start();
        }

        //需要等待上面的20个线程计算完之后再查看计算结果
        while(Thread.activeCount() > 2){
            Thread.yield();
        }

        System.out.println("20个线程执行完之后num:\t" + myData03.num);
    }
}


class MyData03{
    static int num = 0;

    public void increment(){
        num++;
    }

}