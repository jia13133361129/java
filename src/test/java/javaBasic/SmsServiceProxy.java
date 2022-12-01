package javaBasic;

/**
 * @Author: jia
 * Time: 2022/11/4  11:23
 * Description:
 * Version:
 */
public class SmsServiceProxy implements SmsService{

    SmsService smsService = new SmsServiceImpl();


    @Override
    public String send(String message) {
        System.out.println("before");
        smsService.send("smsServiceImpl");
        System.out.println("After");
        return null;
    }
}
