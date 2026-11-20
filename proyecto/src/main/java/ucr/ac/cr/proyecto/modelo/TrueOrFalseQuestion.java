/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyecto.modelo;

/**
 *
 * @author danie
 */
public class TrueOrFalseQuestion {

    String question;
    boolean trueOrFalse;

    public TrueOrFalseQuestion(String question, boolean trueOrFalse) {
        this.question = question;
        this.trueOrFalse = trueOrFalse;
    }

    public boolean isCorrect(boolean answer) {
        if (answer == trueOrFalse) {
            return true;
        } else {
            return false;
        }

    }

    public String getQuestion() {
        return question;
    }

    public boolean getTrueOrFalse() {
        return trueOrFalse;
    }

}
