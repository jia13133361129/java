package javaCollection.arrayList;

/**
 * @Author: jia
 * Time: 2022/11/21  15:36
 * Description:
 * Version:
 */
public class ArraycopyTest {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        System.arraycopy(a, 2, a, 3, 3);
        a[2]=99;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
