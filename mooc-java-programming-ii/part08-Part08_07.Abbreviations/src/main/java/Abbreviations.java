/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zacharychildress
 */

import java.util.HashMap;

public class Abbreviations {
    
    private HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        String sanitaryAb = sanitizedString(abbreviation);
        String sanitaryEx = sanitizedString(explanation);
        this.abbreviations.put(sanitaryAb, sanitaryEx);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if(this.abbreviations.containsKey(sanitizedString(abbreviation))) {
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        String sanitizedAb = sanitizedString(abbreviation);
        if(this.abbreviations.containsKey(sanitizedAb)) {
            return this.abbreviations.get(sanitizedAb);
        }
       
        return null;
    }
    
    public String sanitizedString(String text) {
        if(text == null) {
            return "";
        }
        
        String sanitary = text.toLowerCase();
        return sanitary.trim();
    }
}
