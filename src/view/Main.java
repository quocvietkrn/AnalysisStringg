/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;
import model.*;
import view.AnalysisView;
import controller.*;
/**
 *
 * @author ADMIN
 */
public class Main {
     public static void main(String[] args) {
        String input = "Hello, 123 world! The square of 9 is 81.";

        AnalysisModel model = new AnalysisModel();
        AnalysisView view = new AnalysisView();
        AnalysisController controller = new AnalysisController(model, view);

        controller.analyzeString(input);
    }

}
