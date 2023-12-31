/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import dao.CoachDAO;
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
import model.Coach;
import model.User;

/**
 * FXML Controller class
 *
 * @author Dewi
 */
public class LoginController implements Initializable {
    public static User user;
    public static Coach coach;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    @FXML
    private Button btnLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        user = null;
        coach = null;
    }    
    @FXML
    void loginHandler(ActionEvent event) throws IOException {
        try {
                user = UserDAO.validate(txtUsername.getText(), txtPassword.getText());
                coach = CoachDAO.validate(txtUsername.getText(), txtPassword.getText());
                if (user != null) {
                    Stage stage = (Stage) btnLogin.getScene().getWindow();
                    URL url = new File("src/main/java/view/Homepage.fxml").toURI().toURL();
                    Parent root = FXMLLoader.load(url);
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    System.out.print("selamat datang user");
                    
                } else if(txtUsername.getText().equals("admin")&&txtPassword.getText().equals("admin123")){
                    Stage stage = (Stage) btnLogin.getScene().getWindow();
                    URL url = new File("src/main/java/view/Signup_1.fxml").toURI().toURL();
                    Parent root = FXMLLoader.load(url);
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    System.out.print("selamat datang admin");
                }
                else if(coach != null){
                    Stage stage = (Stage) btnLogin.getScene().getWindow();
                    URL url = new File("src/main/java/view/buatPelatihan.fxml").toURI().toURL();
                    Parent root = FXMLLoader.load(url);
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    System.out.print("selamat datang coach");
                }
                else{
                    JOptionPane.showMessageDialog(null, "INVALID USERNAME/PASSWORD!!!");
                }
            } catch (HeadlessException e) {
                e.printStackTrace();
            }
    }
    
}
