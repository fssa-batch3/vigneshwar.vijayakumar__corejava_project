package day06.solved;

//Store city names using Generics

/**
 * This snippet showcases the usage of ArrayList with generic type.
 * The ArrayList is declared with the type parameter <String>, indicating that it can only store String objects.
 * The elements are retrieved using the for-each loop directly as String objects, eliminating the need for typecasting.
 */

import java.util.ArrayList;

public class TestArrayListWithGenerics {
 
    public static void main(String[] args) {
         
        // Store the city names in the List ( use Generics )
        ArrayList<String> cityList  = new ArrayList<String>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
         
        // Display the city names
        for (String cityName : cityList) {           
            System.out.println(cityName);           
        }
 
    }
 
}
