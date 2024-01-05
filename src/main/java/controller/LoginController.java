/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import dao.UserDAO;
import java.awt.HeadlessException;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import model.User;

/**
 * FXML Controller class
 *
 * @author Dewi
 */
public class LoginController implements Initializable {
    
    public static User user;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        user = null;
    } 
    
    @FXML
    void loginHandler(ActionEvent event) {
        try {
                user = UserDAO.validate(txtUsername.getText(), txtPassword.getText());
                if (user != null) {
                    Stage stage = (Stage) btnLogin.getScene().getWindow();
                    URL url = new File("src/main/java/view/Home.fxml").toURI().toURL();
                    Parent root = FXMLLoader.load(url);
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                } else if(txtUsername.getText().equals("admin")&&txtPassword.getText().equals("admin123")){
                    System.out.print("selamat datang admin");
                }else{
                    JOptionPane.showMessageDialog(null, "INVALID USERNAME/PASSWORD!!!");
                }
            } catch (HeadlessException | IOException e) {
                e.printStackTrace();
            }
    }
    
}
