package lk.ijse.nativeBootStrapping.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class ItemFormController {

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private TableColumn<?, ?> colqty;

    @FXML
    private TableView<?> tblCustomer;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtqty;

    @FXML
    void txtValiName(KeyEvent event) {

    }

    @FXML
    void txtValiPrice(KeyEvent event) {

    }

    @FXML
    void txtValid(KeyEvent event) {

    }

    @FXML
    void txtValiqty(KeyEvent event) {

    }

}
