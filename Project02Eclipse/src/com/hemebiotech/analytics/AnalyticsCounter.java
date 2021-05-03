package com.hemebiotech.analytics;

import java.util.List;


public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		// Read Symptoms from File
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = readSymptomDataFromFile.getSymptoms();


		}
}



