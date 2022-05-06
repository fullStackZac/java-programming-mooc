/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zacharychildress
 */

import java.util.Scanner;
import java.util.ArrayList;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String word = scanner.nextLine();
            
            if(word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if(word.equals("add")) {
                System.out.println("Word:");
                String toTranslate = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                dictionary.add(toTranslate, translation);
            }else if(word.equals("search")){
                System.out.println("To be translated:");
                String getTranslation = scanner.nextLine();
                
                if (this.dictionary.translate(getTranslation) == null) {
                        System.out.println("Word " + getTranslation + " was not found");
                    } else {
                        System.out.println("Translation: " + this.dictionary.translate(getTranslation));
                    }
                
                
                
            }else {
                System.out.println("Unknown command");
            }
        }
    }
}
