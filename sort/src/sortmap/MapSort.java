package sortmap;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017-6-21.
 */
public class MapSort {
    public static Map sortByValue(Map unsortMap) {
        Map sortMap = new TreeMap(new ValueComparator(unsortMap));
        sortMap.putAll(unsortMap);
        return sortMap;

    }
    public static Map sortByKey(Map unsortMap) {
        Map sortMap = new TreeMap();
        sortMap.putAll(unsortMap);
        return sortMap;
    }
}
