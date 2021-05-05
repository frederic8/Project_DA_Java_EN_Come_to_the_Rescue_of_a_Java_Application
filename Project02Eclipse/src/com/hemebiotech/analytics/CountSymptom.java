package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 */
public class CountSymptom implements ICountSymptom {

    @Override
    public TreeMap<String, Integer> count(List<String> symptoms) throws IOException {

        TreeMap<String, Integer> resultsMap = new TreeMap<String, Integer>();

        try {

            for (String word : symptoms) {

                if (!resultsMap.containsKey(word))
                    resultsMap.put(word, 1);

                else {
                    resultsMap.put(word, resultsMap.get(word) + 1);
                }

            }
        } catch (Exception e) {

            System.out.println("An error occurred : ");

            e.printStackTrace();
        }

        System.out.println("Symptoms occurences : " + resultsMap);

        return resultsMap;
    }
}