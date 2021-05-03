package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

// Creer Class "CountSymptoms"  et implementer l'interface "CountSymptom"
public class CountSymptoms implements CountSymptom {

    //Methode pour convertir ArrayList en TreeMap et lister le nombre d'occurences dans la Map
    @Override
    public TreeMap<String, Integer> count(List<String> symptoms) throws IOException {

        TreeMap<String, Integer> resultsMap = new TreeMap<String, Integer>();

        try {

            // Parcourir la TreeMap avec une boucle "for", compter et lister le nombre d'occurences
            for (String word : symptoms) {

                if (!resultsMap.containsKey(word))
                    resultsMap.put(word, 1);

                else {
                    resultsMap.put(word, resultsMap.get(word) + 1);
                }

            }
        } catch (Exception e) {

            //Afficher la phrase suivante : " Une erreur s'est produite : " sur la console
            System.out.println("An error occurred : ");

            //Afficher les exceptions (erreurs) sur la console
            e.printStackTrace();
        }

        //Afficher le contenu de la TreeMap avec les "Symptomes" et leurs "occurences" sur la console.
        System.out.println("Symptoms occurences : " + resultsMap);

        //Retourne la TreeMap
        return resultsMap;
    }
    }