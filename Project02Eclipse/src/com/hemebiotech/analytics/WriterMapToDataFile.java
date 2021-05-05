package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 */
public class WriterMapToDataFile implements ISymptomWriter {

    /**
     * @param resultFilePath a path containing symptom strings and integers the occurrence, one per line
     */
    TreeMap<String, Integer> resultsMap;

    public WriterMapToDataFile(TreeMap<String, Integer> resultsMap) { this.resultsMap = resultsMap; }

    @Override
    public Map.Entry<String, Integer> writeFile(String resultFilePath) throws IOException {

        try {

            FileWriter writer = new FileWriter(resultFilePath);

            BufferedWriter out = new BufferedWriter(writer);

            for (Map.Entry<String, Integer> entry : resultsMap.entrySet()) {

                System.out.println("Valeur : " + entry.getKey() + " | Occurence : " + entry.getValue());

                out.write(entry.getKey() + " = " + entry.getValue() + " \n");
                // Force write
                out.flush();
            }

            System.out.println(" ");

            writer.close();

            System.out.println("Successfully wrote to the file.");


        } catch (IOException e) {

            System.out.println("An error occurred : ");

            e.printStackTrace();
        }
        return null;
    }
}