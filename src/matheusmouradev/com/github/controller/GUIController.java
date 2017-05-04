
package matheusmouradev.com.github.controller;

import javafx.scene.image.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;

import matheusmouradev.com.github.data.*;
import matheusmouradev.com.github.facade.Booking;

/**
 *
 * @author Matheus
 */
public class GUIController implements Initializable {
    
    //Buttons
    @FXML
    private Button btnHome;
    @FXML
    private Button roomButton;
    @FXML
    private Button btnClient;
    @FXML
    private Button btnCalendar;
    
    //Stack Panes
    @FXML
    private Region mainPane;
    @FXML
    private Region roomPane;
    @FXML
    private Region clientPane;
    @FXML
    private Region calendarPane;
    @FXML
    private Pane stackConsole;
    
    @FXML
    private Pane pane1;
    
    //Name Labels
    @FXML
    private Label nameLabel1;
    @FXML
    private Label nameLabel2;
    @FXML
    private Label nameLabel3;
    @FXML
    private Label nameLabel4;
    @FXML
    private Label nameLabel5;
    @FXML
    private Label nameLabel6;
    @FXML
    private Label nameLabel7;
    @FXML
    private Label nameLabel8;
    @FXML
    private Label nameLabel9;
    @FXML
    private Label nameLabel10;
    @FXML
    private Label nameLabel11;
    @FXML
    private Label nameLabel12;
    @FXML
    private Label nameLabel13;
    @FXML
    private Label nameLabel14;
    @FXML
    private Label nameLabel15;
    
    List<Label> listNameLabel = new ArrayList();
    
    //Icon Labels
    @FXML
    private Label iconLabel1;
    @FXML
    private Label iconLabel2;
    @FXML
    private Label iconLabel3;
    @FXML
    private Label iconLabel4;
    @FXML
    private Label iconLabel5;
    @FXML
    private Label iconLabel6;
    @FXML
    private Label iconLabel7;
    @FXML
    private Label iconLabel8;
    @FXML
    private Label iconLabel9;
    @FXML
    private Label iconLabel10;
    @FXML
    private Label iconLabel11;
    @FXML
    private Label iconLabel12;
    @FXML
    private Label iconLabel13;
    @FXML
    private Label iconLabel14;
    @FXML
    private Label iconLabel15;
    
    List<Label> listIconLabel = new ArrayList(14);
    
    //Client Labels
    @FXML
    private Label clientLabel1;
    @FXML
    private Label clientLabel2;
    @FXML
    private Label clientLabel3;
    @FXML
    private Label clientLabel4;
    @FXML
    private Label clientLabel5;
    @FXML
    private Label clientLabel6;
    @FXML
    private Label clientLabel7;
    @FXML
    private Label clientLabel8;
    @FXML
    private Label clientLabel9;
    @FXML
    private Label clientLabel10;
    @FXML
    private Label clientLabel11;
    @FXML
    private Label clientLabel12;
    @FXML
    private Label clientLabel13;
    @FXML
    private Label clientLabel14;
    @FXML
    private Label clientLabel15;
    
    List<Label> listClientLabel = new ArrayList();
    
    //Date Label
    @FXML
    private Label dateLabel1;
    @FXML
    private Label dateLabel2;
    @FXML
    private Label dateLabel3;
    @FXML
    private Label dateLabel4;
    @FXML
    private Label dateLabel5;
    @FXML
    private Label dateLabel6;
    @FXML
    private Label dateLabel7;
    @FXML
    private Label dateLabel8;
    @FXML
    private Label dateLabel9;
    @FXML
    private Label dateLabel10;
    @FXML
    private Label dateLabel11;
    @FXML
    private Label dateLabel12;
    @FXML
    private Label dateLabel13;
    @FXML
    private Label dateLabel14;
    @FXML
    private Label dateLabel15;
    
    List<Label> listDateLabel = new ArrayList();
    
    //Variables
    Booking booking = new Booking();
    
    Image greenIcon = new Image(getClass().getResourceAsStream("greenicon.png"));
    Image blueIcon = new Image(getClass().getResourceAsStream("blueicon.png"));
    Image redIcon = new Image(getClass().getResourceAsStream("redicon.png"));
    
    @FXML
    private void btnHome(ActionEvent e) {
        stackConsole.getChildren().setAll(mainPane);
    }
    
    @FXML
    private void btnRoom(ActionEvent event) {
        stackConsole.getChildren().setAll(roomPane);
    }
    
    @FXML
    private void btnClients(ActionEvent e) {
        stackConsole.getChildren().setAll(clientPane);
    }
    
    @FXML
    private void btnCalendar(ActionEvent event) {
        stackConsole.getChildren().setAll(calendarPane);
    }
    
    @FXML 
    public void clickOnRoomLabel(MouseEvent e) {
        stackConsole.getChildren().setAll(roomPane);
        if (e.getPickResult().getIntersectedNode().getParent().getId() == null && e.getPickResult().getIntersectedNode().getParent().getId().charAt(0) == 'n') {
            System.out.println(e.getPickResult().getIntersectedNode().getId());
            System.out.println("loop2");
        } else {
            System.out.println(e.getPickResult().getIntersectedNode().getParent().getId());
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stackConsole.getChildren().setAll(mainPane);
        pane1.getStyleClass().add("pane");
        
        //Filling Name Label Array
        listNameLabel.add(nameLabel1);
        listNameLabel.add(nameLabel2);
        
        //Filling Icon Label Array
        listIconLabel.add(0, iconLabel1);
        listIconLabel.add(1, iconLabel2);
        listIconLabel.add(1, iconLabel3);
        listIconLabel.add(1, iconLabel4);
        listIconLabel.add(1, iconLabel5);
        listIconLabel.add(1, iconLabel6);
        listIconLabel.add(1, iconLabel7);
        listIconLabel.add(1, iconLabel8);
        listIconLabel.add(1, iconLabel9);
        listIconLabel.add(1, iconLabel10);
        listIconLabel.add(1, iconLabel11);
        listIconLabel.add(1, iconLabel12);
        listIconLabel.add(1, iconLabel13);
        listIconLabel.add(1, iconLabel14);
        listIconLabel.add(1, iconLabel15);
        
        //Filling Client Label Array
        listClientLabel.add(clientLabel1);
        listClientLabel.add(clientLabel2);
        listClientLabel.add(clientLabel3);
        listClientLabel.add(clientLabel4);
        listClientLabel.add(clientLabel5);
        listClientLabel.add(clientLabel6);
        listClientLabel.add(clientLabel7);
        listClientLabel.add(clientLabel8);
        listClientLabel.add(clientLabel9);
        listClientLabel.add(clientLabel10);
        listClientLabel.add(clientLabel11);
        listClientLabel.add(clientLabel12);
        listClientLabel.add(clientLabel13);
        listClientLabel.add(clientLabel14);
        listClientLabel.add(clientLabel15);
        
        //Filling Client Labl Array
        listDateLabel.add(dateLabel1);
        listDateLabel.add(dateLabel2);
        listDateLabel.add(dateLabel3);
        listDateLabel.add(dateLabel4);
        listDateLabel.add(dateLabel5);
        listDateLabel.add(dateLabel6);
        listDateLabel.add(dateLabel7);
        listDateLabel.add(dateLabel8);
        listDateLabel.add(dateLabel9);
        listDateLabel.add(dateLabel10);
        listDateLabel.add(dateLabel11);
        listDateLabel.add(dateLabel12);
        listDateLabel.add(dateLabel13);
        listDateLabel.add(dateLabel14);
        listDateLabel.add(dateLabel15);
        
        
        List<Room> dbRoom = booking.readRoom();

        for (int i=0;i<15;i++) {
            int situation = dbRoom.get(i).getSituation();
            switch(situation) {
                case 0:
                    listIconLabel.get(i).setGraphic(new ImageView(greenIcon));
                    break;
                case 1:
                    listIconLabel.get(i).setGraphic(new ImageView(blueIcon));
                    break;
                case 2:
                    listIconLabel.get(i).setGraphic(new ImageView(redIcon));
                    break;
            }
        }
        
    }

}
