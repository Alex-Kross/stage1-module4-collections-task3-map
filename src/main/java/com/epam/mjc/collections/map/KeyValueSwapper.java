package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            if (map.containsKey(e.getValue())) {
                for (String key : map.keySet()) {
                    if (key.equals(e.getValue())) {
                        if (e.getKey() >= map.get(key)) {
                            map.put(e.getValue(), map.get(key));
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
