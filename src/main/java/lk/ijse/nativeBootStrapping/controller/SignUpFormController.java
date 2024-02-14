package lk.ijse.nativeBootStrapping.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SignUpFormController {

    @FXML
    private JFXButton btnSignUp;

    @FXML
    private AnchorPane signUPPane;

    @FXML
    private TextField txtPwd;

    @FXML
    private TextField txtUserId;

    @FXML
    private TextField txtUserName;

    @FXML
    void signUpOnAction(ActionEvent event) {

    }

}
