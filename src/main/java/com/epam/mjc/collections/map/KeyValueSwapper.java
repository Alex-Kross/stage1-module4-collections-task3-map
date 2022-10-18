package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<Integer, String> map = getMapWithoutRepetitionValue(sourceMap);
        Map<String, Integer> mapSwapping = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            mapSwapping.put(entry.getValue(), entry.getKey());
        }
        return mapSwapping;
    }

    private Map<Integer, String> getMapWithoutRepetitionValue(Map<Integer, String> map) {
        Map<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<Integer, String> e1 : map.entrySet()) {
            if (newMap.containsValue(e1.getValue())) {
                for (Map.Entry<Integer, String> e2 : newMap.entrySet()) {
                    if (e2.getValue().equals(e1.getValue())) {
                        if (e1.getKey() > e2.getKey()) {
                            newMap.put(e2.getKey(), e1.getValue());
                        } else {
                            newMap.put(e1.getKey(), e1.getValue());
                        }
                    }
                }
            }
            else {
                newMap.put(e1.getKey(), e1.getValue());
            }
        }
        return newMap;
    }
}
