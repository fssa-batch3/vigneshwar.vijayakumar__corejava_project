package day06.solved;

//Collections shuffle

//The Collections.shuffle method is used to randomly shuffle the elements in a collection.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String[] args) {
    	
        List<String> list = Arrays.asList(args);
        Collections.shuffle(list);
        System.out.println(list); //[]
    }
}