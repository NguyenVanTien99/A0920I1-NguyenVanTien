package com.service;

import com.repository.IDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements  iDictionaryService{

    @Autowired
    IDictionary iDictionary;

    @Override
    public String toVn(String eng) {
       return iDictionary.findOne(eng);
    }

}
