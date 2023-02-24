package com.service.impl;

import com.service.IDictionaryService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService {
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
