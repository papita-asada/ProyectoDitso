/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyecto.controlador;

import ucr.ac.cr.proyecto.controlador.MainController;
import ucr.ac.cr.proyecto.controlador.QuestionsController;
import ucr.ac.cr.proyecto.modelo.Data;
import ucr.ac.cr.proyecto.vista.Page;

/**
 *
 * @author danie
 */
public class BookController {

    private MainController mainController;
    private Data data;
    private int currentPage = 0;

    public BookController(MainController mainController) {
        this.mainController = mainController;
        data = mainController.getData();
        mainController.getMainFrame().getPage1().getBtnNext().addActionListener(e -> nextPage());
        mainController.getMainFrame().getPage1().getBtnBack().addActionListener(e -> backPage());
        mainController.getMainFrame().getPage1().getBtnMenu().addActionListener(e -> mainController.showMenu());
    }

    public void nextPage() {
        currentPage++;
        loadPage();
    }

    public void backPage() {
        currentPage--;
        loadPage();
    }

    public void loadPage() {
        Page page = mainController.getMainFrame().getPage1();
        page.getLbTitle().setText(data.getPages().get(currentPage).getTitle());
        page.getTxtArea().setText(data.getPages().get(currentPage).getText());
    }

}
