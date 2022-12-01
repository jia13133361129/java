package javaBasic;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author: jia
 * Time: 2022/11/3  10:47
 * Description:
 * Version:
 */
public class JavaBasic {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        SmsService smsService = new SmsServiceProxy();
        smsService.send("1");


    }
}
