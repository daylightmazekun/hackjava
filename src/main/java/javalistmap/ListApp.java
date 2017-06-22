package main.java.javalistmap;

import main.java.javalistmap.vo.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2017-6-21.
 */
public class ListApp {
    public static void main(String[] args){
        List<Person> arrayList = new ArrayList<Person>();
        List<Person> linkedList = new LinkedList<Person>();

        for(Person person: getPersons()){
            arrayList.add(person);
            linkedList.add(person);
        }
        System.out.println("--------------------------print all----------------------");
        System.out.println("Arraylist:"+ arrayList);
        System.out.println("Linkedlist:"+ linkedList);

        for(int i = 0; i < linkedList.size(); i++){
            System.out.println("LinkedList" + i + linkedList.get(i));
        }
        for(Person person:linkedList){
            System.out.println("LinkedList:" + person);
        }
        Collections.sort(linkedList);
        System.out.println("SOrt linkedList" + linkedList);

    }

    private static Person[] getPersons(){
        Person[] persons = new Person[5];
        persons[0] = new Person("Bill", 29);
        persons[1] = new Person("Gates", 32);
        persons[2] = new Person("Jack", 27);
        persons[3] = new Person("Jenifer", 24);
        persons[4] = new Person("Brill", 37);
        return persons;

    }
}
