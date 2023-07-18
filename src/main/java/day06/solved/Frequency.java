package day06.solved;

//Collections frequency

//The Collections.frequency method in Java is used to count the number of occurrences of a specified element in a collection.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Frequency {
    public static void main(String[] args) {
    	Collection<String> list = new ArrayList<>();
    	list.add("EEE");
    	list.add("EEE");
    	list.add("B.Tech");
    	int cnt = Collections.frequency(list, "EEE");
    	System.out.println(cnt);
    }
}