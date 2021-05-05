package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		// Read Symptoms from File
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = readSymptomDataFromFile.getSymptoms();

		System.out.println(" ");

		// Count symptoms from File
		CountSymptom countSymptom = new CountSymptom();
		TreeMap<String, Integer> map = countSymptom.count(symptoms);

		System.out.println(" ");

		}
}



