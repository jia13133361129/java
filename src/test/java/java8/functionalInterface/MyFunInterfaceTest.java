package java8.functionalInterface;

/**
 * @Author: jia
 * Time: 2022/11/25  11:29
 * Description:
 * Version:
 */
public class MyFunInterfaceTest {

    public static void main(String[] args) {
        //这个方法的第一个参数是lambda表达式，相当于是实例化了那个函数式接口
        String s = toUpperString(str -> str.toUpperCase(), "abcd");
        System.out.println(s);
    }

    public static String toUpperString(MyFunInterface<String> mf,String str){
        return mf.getValue(str);
    }
}
