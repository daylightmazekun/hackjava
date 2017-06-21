package sortmap;


import java.util.Comparator;
import java.util.Map;

/**
 * Created by Administrator on 2017-6-21.
 */
public class ValueComparator implements Comparator {
    Map map;
    public ValueComparator(Map map){
        this.map = map;

    }
    public int compare(Object keyA, Object keyB){
        Comparable valueA = (Comparable) map.get(keyA);
        Comparable valueB = (Comparable) map.get(keyB);

        return valueA.compareTo(valueB);
    }

}
