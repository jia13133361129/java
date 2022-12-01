package javaBasic;

import java.lang.reflect.Proxy;

/**
 * @Author: jia
 * Time: 2022/11/3  15:13
 * Description:
 * Version:
 */
public class JdkProxyFactory {
    public static Object getProxy(Object target) {

        // System.out.println(target.getClass());   // class com.jia.javaBasic.SmsServiceImpl
        // System.out.println(Arrays.toString(target.getClass().getInterfaces()));   // [interface com.jia.javaBasic.SmsService]

        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 目标类的类加载
                target.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个
                new DebugInvocationHandler(target)   // 代理对象对应的自定义 InvocationHandler
        );
    }
}