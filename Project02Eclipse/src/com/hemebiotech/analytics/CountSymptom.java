package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

//Creer l'interface
public interface CountSymptom {

    //Methode
    TreeMap<String, Integer> count(List<String> symptoms) throws IOException;
}
