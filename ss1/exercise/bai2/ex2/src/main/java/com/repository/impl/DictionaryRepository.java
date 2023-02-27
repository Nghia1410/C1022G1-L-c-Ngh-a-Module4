package com.repository.impl;

import com.repository.IDictionaryRepository;

import java.util.HashMap;
import java.util.Map;

public class DictionaryRepository implements IDictionaryRepository {
    private static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("red", "màu đỏ");
        dictionary.put("orange", "màu cam");
        dictionary.put("apple", "táo");
        dictionary.put("cat", "mèo");
        dictionary.put("bear", "gấu");
        dictionary.put("smoke", "khói");
    }

    @Override
    public String lookUp(String word) {
        String wordFound = "Not found!";

        for (String x : dictionary.keySet()) {
            if (x.equals(word)) {
                wordFound = dictionary.get(x);
                return wordFound;
            }
        }

        return wordFound;
    }
}
