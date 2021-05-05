package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation,
 * which is a list of strings,
 * that may contain many duplications
 * The implementation does not need to order the list
 */
public interface ISymptomReader {

	/**
	 * Method that @return a list of all symptoms present in the file
	 * If no data is available,
	 * catches @throws IOException and return an empty List
	 */
	List<String> getSymptoms() throws IOException;
}