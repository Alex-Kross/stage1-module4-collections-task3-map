package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        sentence = sentence.toLowerCase();
        String[] strings = sentence.split("[\\s,.]");
        for (String s : strings) {
            if (!s.equals("")) {
                int number = 1;
                if (map.get(s) != null) {
                    number = map.get(s) + 1;
                }
                map.put(s, number);
            }
        }
        return map;
    }
}
