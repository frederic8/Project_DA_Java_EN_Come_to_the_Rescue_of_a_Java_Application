package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		// Read Symptoms from File
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = readSymptomDataFromFile.getSymptoms();

		System.out.println(" ");

		// Count symptoms from File
		CountSymptoms countSymptoms = new CountSymptoms();
		TreeMap<String, Integer> map = countSymptoms.count(symptoms);

		System.out.println(" ");

		// Generate Symptoms output File from Map
		WriterMapToDataFile writerMapToDataFile = new WriterMapToDataFile(map);
		Entry<String, Integer> entry = writerMapToDataFile.writeFile("Project02Eclipse/resultat.out");
		}
}



