package com.service.impl;

import com.repository.IDictionaryRepository;
import com.repository.impl.DictionaryRepository;
import com.service.IDictionaryService;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    IDictionaryRepository dictionaryRepository = new DictionaryRepository();

    @Override
    public String lookUp(String word) {
        return dictionaryRepository.lookUp(word);
    }
}
