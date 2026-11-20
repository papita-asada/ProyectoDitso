package ucr.ac.cr.proyecto.controlador;

import javax.swing.JOptionPane;
import ucr.ac.cr.proyecto.modelo.Data;
import ucr.ac.cr.proyecto.modelo.QuizQuestion;
import ucr.ac.cr.proyecto.modelo.TrueOrFalseQuestion;
import ucr.ac.cr.proyecto.vista.Quiz;
import ucr.ac.cr.proyecto.vista.TrueOrFalse;

/**
 *
 * @author danie
 */
public class QuestionsController {

    private MainController mainController;
    private Data data;

    private int currentQuiz = 0;
    private int quizScore = 0;
    private int currentTrueOrFalse = 0;
    private int trueOrFalseScore = 0;

    public QuestionsController(MainController mainController) {
         this.mainController = mainController;
         data = mainController.getData();
        
        Quiz quiz = mainController.getMainFrame().getQuiz1();
        quiz.getBtnOptionA().addActionListener(e -> answerQuiz("A"));
        quiz.getBtnOptionB().addActionListener(e -> answerQuiz("B"));
        quiz.getBtnOptionC().addActionListener(e -> answerQuiz("C"));
        quiz.getBtnOptionD().addActionListener(e -> answerQuiz("D"));
        quiz.getBtnMenu().addActionListener(e -> mainController.showMenu());

        TrueOrFalse trueOrFalse = mainController.getMainFrame().getTrueOrFalse1();
        trueOrFalse.getBtnTrue().addActionListener(e -> answerTrueOrFalse(true));
        trueOrFalse.getBtnFalse().addActionListener(e -> answerTrueOrFalse(false));
        trueOrFalse.getBtnMenu().addActionListener(e -> mainController.showMenu());
    }

    public void startQuiz() {
        currentQuiz = 0;
        quizScore = 0;
        loadQuiz();
    }

    public void loadQuiz() {
        Quiz quiz = mainController.getMainFrame().getQuiz1();
        QuizQuestion question = data.getQuizQuestions().get(currentQuiz);
        quiz.getLbQuestion().setText(wrap(question.getQuestion(), 400));
        quiz.getLbOptionA().setText(wrap(question.getOptionA(), 280));
        quiz.getLbOptionB().setText(wrap(question.getOptionB(), 280));
        quiz.getLbOptionC().setText(wrap(question.getOptionC(), 280));
        quiz.getLbOptionD().setText(wrap(question.getOptionD(), 280));
    }

    public void answerQuiz(String option) {
        QuizQuestion question = data.getQuizQuestions().get(currentQuiz);
        if (question.isCorrect(option)) {
            quizScore++;
            JOptionPane.showMessageDialog(mainController.getMainFrame(), "¡Correcto!");
        } else {
            JOptionPane.showMessageDialog(mainController.getMainFrame(),
                    "Incorrecto. La respuesta correcta era la " + question.getCorrectOption());
        }
        currentQuiz++;
        if (currentQuiz < data.getQuizQuestions().size()) {
            loadQuiz();
        } else {
            JOptionPane.showMessageDialog(mainController.getMainFrame(),
                    "Quiz terminado. Puntaje: " + quizScore + " de " + data.getQuizQuestions().size());
            mainController.showMenu();
        }
    }

    public void startTrueOrFalse() {
        currentTrueOrFalse = 0;
        trueOrFalseScore = 0;
        loadTrueOrFalse();
    }

    public void loadTrueOrFalse() {
        TrueOrFalse trueOrFalse = mainController.getMainFrame().getTrueOrFalse1();
        TrueOrFalseQuestion question = data.getTrueOrFalseQuestions().get(currentTrueOrFalse);
        trueOrFalse.getLbQuestion().setText(wrap(question.getQuestion(), 400));
    }

    public void answerTrueOrFalse(boolean answer) {
        TrueOrFalseQuestion question = data.getTrueOrFalseQuestions().get(currentTrueOrFalse);
        if (question.isCorrect(answer)) {
            trueOrFalseScore++;
            JOptionPane.showMessageDialog(mainController.getMainFrame(), "¡Correcto!");
        } else {
            JOptionPane.showMessageDialog(mainController.getMainFrame(), "Incorrecto.");
        }
        currentTrueOrFalse++;
        if (currentTrueOrFalse < data.getTrueOrFalseQuestions().size()) {
            loadTrueOrFalse();
        } else {
            JOptionPane.showMessageDialog(mainController.getMainFrame(),
                    "Terminaste. Puntaje: " + trueOrFalseScore + " de " + data.getTrueOrFalseQuestions().size());
            mainController.showMenu();
        }
    }

    private String wrap(String text, int width) {
        return "<html><body style='width:" + width + "px'>" + text + "</body></html>";
    }

}
