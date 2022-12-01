package javaCollection.hashMap;

import java.util.*;

/**
 * @Author: jia
 * Time: 2022/11/21  16:53
 * Description:
 * Version:
 */
public class HashMapTest {
    //声明1个 HashMap的对象
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        //向HashMap添加数据（成对 放入 键 - 值对）
        map.put("Java", 1);
        map.put("hadoop", 2);
        map.put("产品经理", 3);

        //获取 HashMap 的某个数据
        System.out.println("key = 产品经理时的值为：" + map.get("产品经理"));

        System.out.println();
        System.out.println("------------------下面是遍历-------------------");
        test();

    }


    /**
     * 获取HashMap的全部数据：遍历HashMap
     */
    public static void test(){

        // 方法1：获得key-value的Set集合 再遍历
        System.out.println("------------方法1------------");
        // 1、获得key-value对（Entry）的Set集合
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // 2、遍历Set集合，从而获取key-value
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("----------");
        // 2.1、通过迭代器：先获得key-value对（Entry）的Iterator，再循环遍历
        Iterator iter1 = entrySet.iterator();
        while (iter1.hasNext()) {
            // 遍历时，需先获取entry，再分别获取key、value
            Map.Entry entry = (Map.Entry) iter1.next();
            System.out.print((String) entry.getKey());
            System.out.println((Integer) entry.getValue());
        }




        // 方法2：获得key的Set集合 再遍历
        System.out.println("------------方法2------------");

        // 1. 获得key的Set集合
        Set<String> keySet = map.keySet();

        // 2. 遍历Set集合，从而获取key，再获取value
        // 2.1 通过for循环
        for (String key : keySet) {
            System.out.print(key);
            System.out.println(map.get(key));
        }

        System.out.println("----------");

        // 2.2 通过迭代器：先获得key的Iterator，再循环遍历
        Iterator iter2 = keySet.iterator();
        String key = null;
        while (iter2.hasNext()) {
            key = (String) iter2.next();
            System.out.print(key);
            System.out.println(map.get(key));
        }



        // 方法3：获得value的Set集合 再遍历
        System.out.println("------------方法3------------");

        // 1. 获得value的Set集合
        Collection valueSet = map.values();

        // 2. 遍历Set集合，从而获取value
        // 2.1 获得values 的Iterator
        Iterator iter3 = valueSet.iterator();
        // 2.2 通过遍历，直接获取value
        while (iter3.hasNext()) {
            System.out.println(iter3.next());
        }
    }

/**
 * 对于遍历方式，推荐使用针对 key-value对（Entry）的方式：效率高
 * 原因：
 * 1. 对于 遍历keySet 、valueSet，实质上 = 遍历了2次：
 *    第一次转为iterator迭代器遍历、
 *    第二次从HashMap中取出key和value操作
 * 2. 对于遍历entrySet，实质只遍历了1次，也就是获取存储实体Entry（存储了key 和 value ）
 */
}
