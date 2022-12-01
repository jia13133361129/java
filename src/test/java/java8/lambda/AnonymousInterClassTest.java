package java8.lambda;

import org.junit.Test;

/**
 * @Author: jia
 * Time: 2022/11/25  10:44
 * Description:
 * Version:
 */
public class AnonymousInterClassTest {
    public class Out {
        void show() {
            System.out.println("调用 Out 类的 show() 方法");
        }
    }

    public class OutSubClass extends Out{
        @Override
        void show() {
            System.out.println("调用匿名类中的 show() 方法");
        }
    }

    public class TestAnonymousInterClass {
        // 在这个方法中构造一个匿名内部类
        private void show() {
            // 等价于：OutSubClass outSubClass = new OutSubClass();
            Out anonyInter = new Out() {
                // 获取匿名内部类的实例
                @Override
                void show() {
                    System.out.println("调用匿名类中的 show() 方法");
                }
            };
            anonyInter.show();
        }

        @Test
        public void test() {
            TestAnonymousInterClass test = new TestAnonymousInterClass();
            test.show();
        }
    }
}
