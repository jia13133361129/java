package javaBasic;

/**
 * @Author: jia
 * Time: 2022/11/3  15:11
 * Description:
 * Version:
 */
public class SmsServiceImpl implements SmsService {

    @Override
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
