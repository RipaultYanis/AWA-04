/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.awajaba;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author root
 */
public class Appli extends Application {
    
  public void start(Stage primaryStage) throws Exception {
       GridPane root = new GridPane();
       root.setPadding(new Insets(20));
       root.setHgap(25);
       root.setVgap(15);
 
       Label labelTitle = new Label("Enter your user name and password!");
 
       root.add(labelTitle, 0, 0, 2, 1);
 
       Label labelUserName = new Label("User Name");
       TextField fieldUserName = new TextField();
       
 
       Label labelPassword = new Label("Password");
 
       PasswordField fieldPassword = new PasswordField();
 
       Button loginButton = new Button("Login");
        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                if("Administrateur".equals(fieldUserName.getText()) && "azerty".equals(fieldPassword.getText()))
                {
                   System.out.println("Connexion Reussi"); 
                }
                else{
                    Alert dlgNok = new Alert (AlertType.ERROR);
                    dlgNok.setTitle("Marchpo");
                    dlgNok.setHeaderText("Nul Tu sais po taper");
                    dlgNok.setContentText("Nom de Connexion ou Mot de passe Incorrect");
                    dlgNok.showAndWait();
                }
                
               
            }
        });
 
       GridPane.setHalignment(labelUserName, HPos.RIGHT);
 
       // Put on cell (0,1)
       root.add(labelUserName, 0, 1);
 
        
       GridPane.setHalignment(labelPassword, HPos.RIGHT);
       root.add(labelPassword, 0, 2);
 
       // Horizontal alignment for User Name field.
       GridPane.setHalignment(fieldUserName, HPos.LEFT);
       root.add(fieldUserName, 1, 1);
 
       // Horizontal alignment for Password field.
       GridPane.setHalignment(fieldPassword, HPos.LEFT);
       root.add(fieldPassword, 1, 2);
 
       // Horizontal alignment for Login button.
       GridPane.setHalignment(loginButton, HPos.RIGHT);
       root.add(loginButton, 1, 3);
 
       Scene scene = new Scene(root, 300, 300);
       primaryStage.setTitle("AWA_04");
       primaryStage.setScene(scene);
       primaryStage.show();
   }
 
   public static void main(String[] args) {
       launch(args);
   }
 
}
