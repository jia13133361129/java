package java8.functionalInterface;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * @Author: jia
 * Time: 2022/11/25  11:10
 * Description:
 * Version:
 */
public class ConsumerTest {
    @Test
    public void test1(){

        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("学习太累了，去天上人间买了瓶矿泉水，价格为：" + aDouble);
            }
        });

        System.out.println("********************");
        // lambda 表达式
        happyTime(400,money -> System.out.println("学习太累了，去天上人间喝了口水，价格为：" + money));
    }

    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }
}
