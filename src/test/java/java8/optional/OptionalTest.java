package java8.optional;

import org.junit.Test;

import java.util.Optional;

/**
 * Optional类：为了在程序中避免出现空指针异常而创建的。
 *
 * 常用的方法：ofNullable(T t)
 *            orElse(T t)
 *
 */
public class OptionalTest {

    /*
    Optional.of(T t) : 创建一个 Optional 实例，t必须非空；
    Optional.empty() : 创建一个空的 Optional 实例
    Optional.ofNullable(T t)：t可以为null
     */
    @Test
    public void test1(){
        Girl girl = new Girl();
        // girl = null;
        // of(T t):保证t是非空的
        Optional<Girl> optionalGirl = Optional.of(girl);
        System.out.println(optionalGirl);
    }

    @Test
    public void test2(){
        Girl girl = new Girl();
        // girl = null;
        // ofNullable(T t)：t可以为null
        Optional<Girl> optionalGirl = Optional.ofNullable(girl);
        System.out.println(optionalGirl);
        // orElse(T t1):如果当前的Optional内部封装的t是非空的，则返回内部的t.
        // 如果内部的t是空的，则返回orElse()方法中的参数t1.
        Girl girl1 = optionalGirl.orElse(new Girl("赵丽颖"));
        System.out.println(girl1);
    }
    

    // NullPointerException
    @Test
    public void test3(){
        Boy boy = null;
        // Girl girl = boy.getGirl(); // NullPointerException
        // System.out.println(girl);
        String girlName = boy.getGirl().getName();  // NullPointerException
        System.out.println(girlName);
    }

    // 没有Optional的解决办法
    // 但是如果调用层数过多，就得一层一层判断是否为null，写起来很麻烦。
    @Test
    public void test4(){
        Boy boy = null;
        String girlName = null;
        if(boy != null){
            Girl girl = boy.getGirl();
            if(girl != null){
                girlName =  girl.getName();
            }
        }
        System.out.println(girlName);
    }

    // 使用Optional解决问题：这种是绝对不会出现空指针的。
    // 利用 orElse 函数
    @Test
    public void test5(){
        Boy boy = null;
        boy = new Boy(new Girl("苍老师"));

        Optional<Boy> boyOptional = Optional.ofNullable(boy);
        //此时的boy1一定非空
        Boy boy1 = boyOptional.orElse(new Boy(new Girl("迪丽热巴")));

        Girl girl = boy1.getGirl();

        Optional<Girl> girlOptional = Optional.ofNullable(girl);
        //girl1一定非空
        Girl girl1 = girlOptional.orElse(new Girl("古力娜扎"));

        String girlName = girl1.getName();
        System.out.println(girlName);
    }

}
