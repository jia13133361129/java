package javaBasic;

/**
 * @Author: jia
 * Time: 2022/11/3  10:47
 * Description:
 * Version:
 */
public class TargetObject {
    private String value;

    public TargetObject() {
        value = "JavaGuide";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
