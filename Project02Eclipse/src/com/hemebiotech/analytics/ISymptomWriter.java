package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

//Creer l'interface
public interface ISymptomWriter {

    //Methode
    Map.Entry<String, Integer> writeFile(String resultFilePath) throws IOException;
}

