/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.prn335.junitmockitotests;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hernandez
 */
public class MyDictionary {
    Map<String, String> wordMap;
    public MyDictionary(){
        wordMap= new HashMap<String, String>();
        
    }
    public MyDictionary( Map<String, String> wordMap){
        this.wordMap=wordMap ;
        
    }
    public void add(final String word, final String meaning){
        wordMap.put(word, meaning);
    }
    public String getMeaning(final String word){
        return wordMap.get(word);
    }
}
