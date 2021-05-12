package com.repository;

import com.model.Dictionary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DictionaryIpml implements IDictionary {

    private static Map<Integer, Dictionary> dictionaries = new HashMap<>();

    static {
        dictionaries.put(1, new Dictionary("hello","Xin chào"));
        dictionaries.put(2, new Dictionary("hello1","Xin chào1"));
        dictionaries.put(3, new Dictionary("hello2","Xin chào2"));
        dictionaries.put(4, new Dictionary("hello3","Xin chào3"));
        dictionaries.put(5, new Dictionary("hello4","Xin chào4"));
        dictionaries.put(6, new Dictionary("hello5","Xin chào5"));
        dictionaries.put(7, new Dictionary("hello6","Xin chào6"));
        dictionaries.put(8, new Dictionary("hello7","Xin chào7"));
        dictionaries.put(9, new Dictionary("hello8","Xin chào8"));
        dictionaries.put(10, new Dictionary("hello9","Xin chào9"));

    }

    @Override
    public String findOne(String eng) {
        String result = null;

        List<Dictionary> dictionaries = new ArrayList<>(DictionaryIpml.dictionaries.values());

        for (int i = 0; i < dictionaries.size(); i++) {
            if(dictionaries.get(i).getEng().equalsIgnoreCase(eng)){
                result = dictionaries.get(i).getVnd();
            }
        }

        return result;

    }
}
