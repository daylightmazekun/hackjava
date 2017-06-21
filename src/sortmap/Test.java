package sortmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-6-21.
 */
public class Test {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("Z", "3");
        map.put("D", "4");
        map.put("A", "1");
        map.put("B", "2");
        map.put("F", "6");
        map.put("E", "5");

        System.out.println("Unsorted Map: "+map);
        System.out.println("Sorted Map By Values: "+MapSort.sortByValue(map));
        System.out.println("Sorted Map By Keys: "+MapSort.sortByKey(map));
    }


}
