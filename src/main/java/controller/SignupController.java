/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS Vivobook
 */
public class SignupController implements Initializable {

    @FXML
    private TextField txtNama;
    @FXML
    private Button btnHome;
    @FXML
    private TextField txtEmail;
    @FXML
    private DatePicker dateDOB;
    @FXML
    private TextField txtUsername;
    @FXML
    private RadioButton btnLk;
    @FXML
    private ToggleGroup genderUser;
    @FXML
    private RadioButton btnPr;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnSignup;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    void handlerHome(ActionEvent event) throws IOException {
    Stage stage = (Stage) btnHome.getScene().getWindow();
        URL url = new File("src/main/java/view/Homepage.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Equals  ");
        stage.show();
    }
    
    @FXML
    void handlerSignup(ActionEvent event) {
    }
    
}
