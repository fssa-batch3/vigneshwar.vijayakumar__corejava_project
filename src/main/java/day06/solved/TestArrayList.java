package day06.solved;

//Store city names in a ArrayList

/** 
 * This snippet demonstrates the usage of ArrayList without generic type.
 * The ArrayList is declared without specifying the type of elements it will hold, allowing any type of object to be added.
 * The elements are retrieved using the for-each loop, and a typecast `(String)` is required to convert the retrieved object to a String.
 */

import java.util.ArrayList;

public class TestArrayList {

    //without using generics
    public static void main(String[] args) {
     
        // Store the city names in the List
        ArrayList cityList  = new ArrayList();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
         
        // Display the city names
        for (Object object : cityList) {
            String cityName = (String) object; // TypeCast object to String
            System.out.println(cityName);           
        }
 
    }
}
