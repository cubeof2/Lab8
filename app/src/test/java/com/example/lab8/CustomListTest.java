package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        City mockCity = new City("Estevan", "SK");
        list = MockCityList();
        list.addCity(mockCity);
        assertEquals(list.hasCity(mockCity),true);
    }

    @Test
    public void deleteCityTest(){
        City mockCity = new City("Estevan", "SK");
        list = MockCityList();
        list.addCity(mockCity);
        list.deleteCity(mockCity);
        assertEquals(list.hasCity(mockCity),false);
    }

    @Test
    public void countCitiesTest() {
        City mockCity = new City("Estevan", "SK");
        City mockCity2 = new City("Regina", "SK");
        list = MockCityList();
        list.addCity(mockCity);
        list.addCity(mockCity2);
        assertEquals(list.countCities(), 2);
    }
}
