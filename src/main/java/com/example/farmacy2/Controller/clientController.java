package com.example.farmacy2.Controller;

import com.example.farmacy2.Service.ModelFactoryService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class clientController {

    ModelFactoryController mfc=ModelFactoryController.getInstance();

    @FXML
    private Button btnListClient;

    @FXML
    private Button btnSaveClient;

    @FXML
    private TextField txtAgeClient;

    @FXML
    private TextField txtNameClient;

    @FXML
    private VBox txtSpaceList;

    @FXML
    private Text txtList;

    @FXML
    void saveClient(ActionEvent event) {
        mfc.saveClient(txtNameClient.getText(),Integer.parseInt(txtAgeClient.getText()));
    }

    @FXML
    void seeList(ActionEvent event) {
        txtList.setText(mfc.laboratorio.getShowMaquinatorList().ShowList(mfc.laboratorio.getClientService().getListClient()));
    }

}
