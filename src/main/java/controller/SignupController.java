/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Dewi
 */
public class SignupController implements Initializable {

    @FXML
    private TextField txtNama;
    @FXML
    private TextField txtEmail;
    @FXML
    private DatePicker dateDOB;
    @FXML
    private RadioButton btnLk;
    @FXML
    private RadioButton btnPr;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnSignup;
    @FXML
    private ToggleGroup genderUser;
    @FXML
    private TextField txtUsername;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handlerSignup(ActionEvent event) {
    String name = txtNama.getText();
    // calender Date dob =  dateDOB.getValue(); 
    // gender String gender = genderUser.getValue()
    String email = txtEmail.getText();
    String username = txtUsername.getText();
    String password = txtPassword.getText();
    } 
}
