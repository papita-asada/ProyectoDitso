/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyecto.modelo;

/**
 *
 * @author danie
 */
public class QuizQuestion {

    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String correctOption;

    public QuizQuestion(String question, String optionA, String optionB, String optionC, String optionD, String correctOption) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;

    }

    public boolean isCorrect(String option) {
        if (option.equals(correctOption)) {
            return true;
        } else {
            return false;
        }
    }

    public String getQuestion() {
        return question;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public String getCorrectOption() {
        return correctOption;
    }

}
