/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package test;

import model.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**


 @author Luciano
 */
public class mainController implements Initializable{

    @FXML
    private Button newViaje;
    @FXML
    private Button btnVerViajes;
    @FXML
    private AnchorPane ventana;

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
    
    /**
    * Abre la ventana de nuevo viaje
    *
    */
    @FXML
    private void openVentanaViaje(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NuevoViaje.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(((Node)event.getTarget()).getScene().getWindow());
            stage.setTitle("Nuevo Viaje");
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.show();
        }
        catch (Exception ex){
            ex.getMessage();
        }
    }
    /**
    * Abre la ventana de vista de los viajes
    *
    */
    @FXML
    private void openVentanaVerViajes(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("verViajes.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(((Node)event.getTarget()).getScene().getWindow());
            stage.setTitle("Viajes");
            stage.setScene(new Scene(root1)); 
            stage.setResizable(false);
            stage.show();
        }
        catch (Exception ex){
            ex.getMessage();
        }
    }
}
