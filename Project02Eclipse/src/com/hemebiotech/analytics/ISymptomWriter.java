package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * Anything that will read symptom data from a source
 * The important part is the return value of the operation,
 * which is a list of strings and integers
 * which contains the list of symptoms and their occurrences
 * The implementation ranks the list alphabetically
 */
public interface ISymptomWriter {
    /**
     * Method that @returns a list of all symptoms and their occurrences present in the Map
     * If no data is available
     * catches @throws IOException and return an empty list
     */
    Map.Entry<String, Integer> writeFile(String resultFilePath) throws IOException;
}