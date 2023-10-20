/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import java.util.List;
import model.*;
import view.AnalysisView;
/**
 *
 * @author ADMIN
 */
// Controller
public class AnalysisController {
    public AnalysisModel model;
    public AnalysisView view;

    public AnalysisController(AnalysisModel model, AnalysisView view) {
        this.model = model;
        this.view = view;
    }

    public void analyzeString(String input) {
        HashMap<String, List<Integer> > numberAnalysis = model.analyzeNumbers(input);
        HashMap<String, StringBuilder> characterAnalysis = model.analyzeCharacters(input);
        int characterCount = input.length();

        view.displayNumberAnalysis(numberAnalysis);
        view.displayCharacterAnalysis(characterAnalysis);
        view.displayCharacterCount(characterCount);
    }
}

