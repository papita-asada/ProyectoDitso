/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyecto.controlador;

import ucr.ac.cr.proyecto.vista.MainFrame;
import ucr.ac.cr.proyecto.controlador.BookController;
import ucr.ac.cr.proyecto.controlador.QuestionsController;
import ucr.ac.cr.proyecto.modelo.Data;

/**
 *
 * @author danie
 */
public class MainController {

    MainFrame mainFrame;
    QuestionsController questionsController;
    BookController bookController;
    HistoryController historyController;
    Data data;

    public static void main(String[] args) {
        new MainController();
    }

    public MainController() {
        mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.allInvisible();
        mainFrame.getMainMenu1().setVisible(true);
        mainFrame.getMainMenu1().getBtnBook().addActionListener(e -> showBook());
        mainFrame.getMainMenu1().getBtnQuiz().addActionListener(e -> showQuiz());
        mainFrame.getMainMenu1().getBtnTrueFalse().addActionListener(e -> showTrueOrFalse());
        mainFrame.getMainMenu1().getBtnHistory().addActionListener(e -> showHistory());
        data = new Data();

        questionsController = new QuestionsController(this);
        bookController = new BookController(this);
        historyController = new HistoryController(this);

    }

    public void showBook() {
        mainFrame.allInvisible();
        mainFrame.getPage1().setVisible(true);
        bookController.loadPage();
    }

    public void showMenu() {
        mainFrame.allInvisible();
        mainFrame.getMainMenu1().setVisible(true);
    }

    public void showQuiz() {
        mainFrame.allInvisible();
        mainFrame.getQuiz1().setVisible(true);
        questionsController.startQuiz();
    }

    public void showTrueOrFalse() {
        mainFrame.allInvisible();
        mainFrame.getTrueOrFalse1().setVisible(true);
        questionsController.startTrueOrFalse();
    }

    public void showHistory() {
        mainFrame.allInvisible();
        mainFrame.getHistoryOrder1().setVisible(true);
        historyController.startHistory();
    }

    public Data getData() {
        return data;
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }

    public QuestionsController getQuestionsController() {
        return questionsController;
    }

    public HistoryController getHistoryController() {
        return historyController;
    }

    public BookController getBookController() {
        return bookController;
    }

}
