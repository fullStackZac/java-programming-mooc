/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zacharychildress
 */
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
            this.dictionary.putIfAbsent(word, new ArrayList<>());
            ArrayList<String> translations = this.dictionary.get(word);
            translations.add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        ArrayList<String> emptyList = new ArrayList<>();
        return this.dictionary.getOrDefault(word, emptyList);
    }
    
    public void remove(String word) {
        this.dictionary.remove(word, this.dictionary.get(word));
    }
}
