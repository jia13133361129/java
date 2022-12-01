package javaCollection;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @Author: jia
 * Time: 2022/11/23  21:30
 * Description:
 * Version:
 */
public class CollectionTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new ArrayList<>();
        new Vector<>();
        new LinkedList<>();

        new HashSet<>();
        new LinkedHashSet<>();
        new TreeSet<>();

        new ArrayDeque<>();
        new PriorityQueue<>();

        new HashMap<>();
        new ConcurrentHashMap<>();
        new Hashtable<>();
        new TreeMap<>();

        // List<Integer> list = new ArrayList<Integer>();
        // Collections.sort(list, new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer o1, Integer o2) {
        //         return 0;
        //     }
        // });


        String [] s= new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        //没有指定类型的话会报错
        s=list.toArray(new String[0]);
        System.out.println(Arrays.toString(s));

        List<String> list1 = new ArrayList<>(Arrays.asList(s));
        Integer [] myArray = { 1, 2, 3 };
        List myList = Arrays.stream(myArray).collect(Collectors.toList());
        //基本类型也可以实现转换（依赖boxed的装箱操作）
        int [] myArray2 = { 1, 2, 3 };
        List myList2 = Arrays.stream(myArray2).boxed().collect(Collectors.toList());

    }






}
