package main.java.javalistmap;

import main.java.javalistmap.vo.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017-6-21.
 */
public class MapApp {
    public static void main(String[] args) {

        Map<String, Person> hashMap = new HashMap<String, Person>();
        Map<String, Person> treeMap = new TreeMap<String, Person>();

        int k = 0;
        for (Person person : getPersons()) {
            hashMap.put("" + k, person);
            treeMap.put("" + k++, person);
            System.out.println(k);
        }
        System.out.println(hashMap);
        System.out.println(treeMap);

        for(String key:treeMap.keySet()){
            System.out.println("treeMap:" + key + ", value" + treeMap.get(key));
        }
        for(String key:hashMap.keySet()){
            System.out.println("hashMap:" + key + ", value" + hashMap.get(key));
        }
        for(Entry<String, Person> entry :treeMap.entrySet()){
            System.out.println("treeMap:" + entry.getKey() + "value"+entry.getValue());
        }

    }

    private static Person[] getPersons() {
        Person[] persons = new Person[5];
        persons[0] = new Person("Bill", 29);
        persons[1] = new Person("Gates", 32);
        persons[2] = new Person("Jack", 27);
        persons[3] = new Person("Jenifer", 24);
        persons[4] = new Person("Brill", 37);
        return persons;

    }
}
