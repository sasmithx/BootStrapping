package lk.ijse.nativeBootStrapping.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginFormController {

    @FXML
    private ComboBox<?> cmbUserId;

    @FXML
    private AnchorPane paneLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    static String id;

    @FXML
    void signInOnAction(ActionEvent event) {
        id = (String) cmbUserId.getValue();


    }

    @FXML
    void signUpOnAction(ActionEvent event) {

    }

}
