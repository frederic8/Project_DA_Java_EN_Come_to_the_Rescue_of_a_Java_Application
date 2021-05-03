package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

// Creer Class "WriterMapToDataFile" et implementer l'interface "ISymptomWriter"
public class WriterMapToDataFile implements ISymptomWriter {

    // Créer attribut
    TreeMap<String, Integer> resultsMap;

    //Constructeur
    public WriterMapToDataFile(TreeMap<String, Integer> resultsMap) { this.resultsMap = resultsMap; }

    // Methode
    @Override
    public Map.Entry<String, Integer> writeFile(String resultFilePath) throws IOException {

        try {

            // Creer le fichier de sortie
            FileWriter writer = new FileWriter(resultFilePath);

            // Ecrire dans le Fichier de sortie
            BufferedWriter out = new BufferedWriter(writer);

            ////Créer boucle pour transmettre les informations contenus dans la Map au fichier de sortie
            for (Map.Entry<String, Integer> entry : resultsMap.entrySet()) {

                // Affiche le résultat dans la console
                System.out.println("Valeur : " + entry.getKey() + " | Occurence : " + entry.getValue());

                // Ecrit le resultat dans le fichier de sortie
                out.write(entry.getKey() + " = " + entry.getValue() + " \n");
                // Force l'ecriture
                out.flush();
            }

            System.out.println(" ");

            //Fremer l'ecriture
            writer.close();

            //Afficher la phrase suivante : "Écrit avec succès dans le fichier." sur la console
            System.out.println("Successfully wrote to the file.");


        //Attraper les exceptions (erreurs) si il y en a.
        } catch (IOException e) {

            //Afficher la phrase suivante : " Une erreur s'est produite : " sur la console
            System.out.println("An error occurred : ");

            //Afficher les exceptions (erreurs) sur la console
            e.printStackTrace();
        }
            //Ne retourne rien
            return null;
    }
    }
