package com.hemebiotech.analytics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    private final String filepath;

    public ReadSymptomDataFromFile (String filepath) {
        this.filepath = filepath;
    }

    @Override
    public List<String> getSymptoms() throws IOException{

        ArrayList<String> result = new ArrayList<String>();

        if (filepath != null) {

            try {
                BufferedReader reader = new BufferedReader(new FileReader(filepath));

                String line = reader.readLine();

                while (line != null) {
                    result.add(line);

                    System.out.println("Symptom : " + line);

                    line = reader.readLine();

                }
                reader.close();

            } catch (IOException e) {
                System.out.println("An error occurred : ");
                e.printStackTrace();
            }
        }
        return result;

    }
}
