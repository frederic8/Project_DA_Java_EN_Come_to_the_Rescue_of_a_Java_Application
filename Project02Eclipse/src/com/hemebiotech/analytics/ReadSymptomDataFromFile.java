package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


// Creer Class "ReadSymptomDataFromFile"  et implementer l'interface "ISymptomReader"
public class ReadSymptomDataFromFile implements ISymptomReader {

	// Créer attribut
	private final String filepath;

	//Constructeur
	public ReadSymptomDataFromFile (String filepath) {

		this.filepath = filepath;
	}

	//Methode
	@Override
	public List<String> getSymptoms() {

		//Créer Arraylist de type String nommé "result" egale à une nouvelle instance de type Arraylist
		//qui liste les elements que contient le document "symptoms.txt"
		ArrayList<String> result = new ArrayList<String>();

		//Créer boucle pour lire le fichier ligne par ligne
		if (filepath != null) {

			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));

				String line = reader.readLine();

				while (line != null) {
					result.add(line);

					//Afficher le contenu de la liste les "Symptomes" sur la console.
					System.out.println("Symptom : " + line);

					line = reader.readLine();

				}
				//Fremer la lecture
				reader.close();

		  //Attraper les exceptions (erreurs) si il y en a.
		} catch (IOException e) {

			//Afficher la phrase suivante : " Une erreur s'est produite : " sur la console
			System.out.println("An error occurred : ");

			//Afficher les exceptions (erreurs) sur la console
			e.printStackTrace();
		}
		}
		//Retourne la liste
		return result;

	}
}

