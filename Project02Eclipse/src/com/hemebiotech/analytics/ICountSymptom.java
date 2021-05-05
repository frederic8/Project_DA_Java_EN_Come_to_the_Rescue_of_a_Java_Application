package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

/**
 * All symptom data in the list is ordered and filed
 * The important part is the return value of the operation,
 * which is a map of the symptoms and their occurrences
 * that count and display the numbers of duplications of each symptoms
 * The implementation is sorted alphabetically in the map
 */

public interface ICountSymptom {

    /**
     * Method to convert ArrayList of symptoms into a TreeMap that sorts the symptoms alphabetically
     * Lists the number of occurrences of each symptom in the Map
     * and catches @throws IOException and returns the map
     */
    TreeMap<String, Integer> count(List<String> symptoms) throws IOException;
}