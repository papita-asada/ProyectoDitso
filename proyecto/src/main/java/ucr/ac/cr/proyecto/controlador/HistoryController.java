package ucr.ac.cr.proyecto.controlador;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import ucr.ac.cr.proyecto.modelo.Data;
import ucr.ac.cr.proyecto.vista.HistoryOrder;

/**
 *
 * @author danie
 */
public class HistoryController {

    private MainController mainController;
    private Data data;
    private ArrayList<Integer> pressed;

    public HistoryController(MainController mainController) {
        this.mainController = mainController;
        data = mainController.getData();
        pressed = new ArrayList<>();

        HistoryOrder history = mainController.getMainFrame().getHistoryOrder1();
        history.getBtnImg1().addActionListener(e -> pressImage(1, history.getBtnImg1()));
        history.getBtnImg2().addActionListener(e -> pressImage(2, history.getBtnImg2()));
        history.getBtnImg3().addActionListener(e -> pressImage(3, history.getBtnImg3()));
        history.getBtnImg4().addActionListener(e -> pressImage(4, history.getBtnImg4()));
        history.getBtnImg5().addActionListener(e -> pressImage(5, history.getBtnImg5()));
        history.getBtnMenu().addActionListener(e -> mainController.showMenu());
    }

    public void startHistory() {
        pressed.clear();
        HistoryOrder history = mainController.getMainFrame().getHistoryOrder1();
        history.getBtnImg1().setEnabled(true);
        history.getBtnImg2().setEnabled(true);
        history.getBtnImg3().setEnabled(true);
        history.getBtnImg4().setEnabled(true);
        history.getBtnImg5().setEnabled(true);
    }

    public void pressImage(int number, JButton button) {
        pressed.add(number);
        button.setEnabled(false);

        if (pressed.size() == data.getHistoryOrder().size()) {
            checkOrder();
        }
    }

    public void checkOrder() {
        if (pressed.equals(data.getHistoryOrder())) {
            JOptionPane.showMessageDialog(mainController.getMainFrame(), "¡Correcto! Ese es el orden de la historia.");
            mainController.showMenu();
        } else {
            JOptionPane.showMessageDialog(mainController.getMainFrame(), "Incorrecto. Intenta de nuevo.");
            startHistory();
        }
    }

}
