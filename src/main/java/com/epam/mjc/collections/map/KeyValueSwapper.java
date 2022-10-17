package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            if (map.containsKey(e.getValue())) {
                for (Map.Entry<String, Integer> e2 : map.entrySet()) {
                    if (e2.getKey().equals(e.getValue())) {
                        if (e.getKey() >= e2.getValue()) {
                            map.put(e.getValue(), e2.getValue());
                        } else {
                            map.put(e.getValue(), e.getKey());
                        }
                    }
                }
            } else {
                map.put(e.getValue(), e.getKey());
            }
        }
        return map;
    }
}
