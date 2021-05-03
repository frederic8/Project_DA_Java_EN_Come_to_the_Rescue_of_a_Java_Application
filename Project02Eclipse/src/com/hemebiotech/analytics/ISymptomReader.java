package com.hemebiotech.analytics;

import java.util.List;

//Creer l'interface
public interface ISymptomReader {

	//Methode qui retourne la liste de tous les symptmes du fichier "symptoms.txt"
	List<String> getSymptoms();
}
