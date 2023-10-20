/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class AnalysisView {
    public void displayNumberAnalysis(HashMap<String, List<Integer>> numberAnalysis) {
        System.out.println("Number Analysis:");
        System.out.println("All Numbers: " + numberAnalysis.get("allNumbers"));
        System.out.println("Even Numbers: " + numberAnalysis.get("evenNumbers"));
        System.out.println("Odd Numbers: " + numberAnalysis.get("oddNumbers"));
        System.out.println("Square Numbers: " + numberAnalysis.get("squareNumbers"));
    }

    public void displayCharacterAnalysis(HashMap<String, StringBuilder> characterAnalysis) {
        System.out.println("\nCharacter Analysis:");
        System.out.println("All Characters: " + characterAnalysis.get("allCharacters"));
        System.out.println("Special Characters: " + characterAnalysis.get("specialCharacters"));
        System.out.println("Uppercase Characters: " + characterAnalysis.get("uppercaseCharacters"));
        System.out.println("Lowercase Characters: " + characterAnalysis.get("lowercaseCharacters"));
    }

    public void displayCharacterCount(int characterCount) {
        System.out.println("Number of Characters in the String: " + characterCount);
    }
}




