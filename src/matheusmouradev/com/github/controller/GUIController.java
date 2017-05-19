
package matheusmouradev.com.github.controller;


import java.io.IOException;
import javafx.scene.image.Image;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

import matheusmouradev.com.github.data.*;
import matheusmouradev.com.github.facade.Booking;
import matheusmouradev.com.github.view.app;

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
    
    //Room pane
    @FXML
    private Label roomPaneLabel;
    @FXML
    private ChoiceBox boxRoom;
    @FXML
    private ChoiceBox boxClient;
    @FXML
    private DatePicker bookDatePicker;
    @FXML
    private DatePicker enterDatePicker;
    @FXML
    private DatePicker exitDatePicker;
    @FXML
    private TextField dailyAmountText;
    @FXML
    private TextField totalAmountText;
    @FXML
    private Label messageLabel;  
    @FXML
    private Button searchClientBtn;

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
        clearRoomPane();
    }
    
    @FXML
    private void btnClients(ActionEvent e) {
        stackConsole.getChildren().setAll(clientPane);
    }
    
    @FXML
    private void btnCalendar(ActionEvent event) {
        stackConsole.getChildren().setAll(calendarPane);
    }
    app ap = new app();
    
    @FXML
    private void searchClientDialog(ActionEvent event) {
        try{
            Parent root1 = FXMLLoader.load(ap.getClass().getResource("resources/ClientDialog.fxml"));
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("Search");
            Scene scene = new Scene(root1);
            stage.setScene(scene);  
            String css = ap.getClass().getResource("resources/style.css").toExternalForm(); 
            scene.getStylesheets().add(css);
            stage.show();
            stage.setOnCloseRequest((WindowEvent t)-> {  
                t.consume();;
                System.out.println(t.getSource());
            });
        } catch(IOException e) {      
        }
    }
        
    @FXML 
    public void clickOnRoomLabel(MouseEvent e) {
        stackConsole.getChildren().setAll(roomPane);
        String id;
        int roomNumber;
        if (e.getPickResult().getIntersectedNode().getParent().getId() == null) {
            id = e.getPickResult().getIntersectedNode().getId();
            roomNumber = Character.getNumericValue(id.charAt(4));
            try{
                int x = Integer.valueOf(String.valueOf(roomNumber) + String.valueOf(Character.getNumericValue(id.charAt(5))));
                roomNumber = x;
            }catch(StringIndexOutOfBoundsException ex) {
            }
        } else {
            if (e.getPickResult().getIntersectedNode().getParent().getId().charAt(0) == 'n') {
                int number = Character.getNumericValue(e.getPickResult().getIntersectedNode().getParent().getId().charAt(9));
                if(number == 1) {
                    try {
                        if(e.getPickResult().getIntersectedNode().getParent().getId().charAt(10) != 0) {
                            int number2 = Character.getNumericValue(e.getPickResult().getIntersectedNode().getParent().getId().charAt(10));
                            int k = Integer.valueOf(String.valueOf(number) + String.valueOf(number2));
                            roomNumber = k;
                        } else {
                            roomNumber = number;
                        }
                    } catch (StringIndexOutOfBoundsException ex) {
                        roomNumber = number;
                    }
                } else {
                    roomNumber = number;
                }
            } else {
                id = e.getPickResult().getIntersectedNode().getParent().getId();
                roomNumber = Character.getNumericValue(id.charAt(4));
                try{
                    int x = Integer.valueOf(String.valueOf(roomNumber) + String.valueOf(Character.getNumericValue(id.charAt(5))));
                    roomNumber = x;
                }catch(StringIndexOutOfBoundsException ex) {
                }
            }
        }
        fillRoomPane(roomNumber);
        
    }   
    
    private void fillRoomPane(int number) {
        boxRoom.getSelectionModel().select(number -1);
        boxRoom.setDisable(true);
    } 
    
    private void clearRoomPane() {
        boxRoom.getSelectionModel().select(-1);
        boxRoom.setDisable(false);
        boxClient.getSelectionModel().select(-1);
        boxClient.setDisable(false);
        
        String textBook = new Date().toString();
        bookDatePicker.setValue(LocalDate.now(ZoneId.of("Brazil/East")));
        bookDatePicker.setDisable(true);
        enterDatePicker.setValue(null);
        exitDatePicker.setValue(null);
        
        messageLabel.setText("");
        messageLabel.getStyleClass().add("cleanMessage");
    }
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stackConsole.getChildren().setAll(mainPane);
        
        //Filling Name Label Array
        listNameLabel.add(nameLabel1);
        listNameLabel.add(nameLabel2);
        listNameLabel.add(nameLabel3);
        listNameLabel.add(nameLabel4);
        listNameLabel.add(nameLabel5);
        listNameLabel.add(nameLabel6);
        listNameLabel.add(nameLabel7);
        listNameLabel.add(nameLabel8);
        listNameLabel.add(nameLabel9);
        listNameLabel.add(nameLabel10);
        listNameLabel.add(nameLabel11);
        listNameLabel.add(nameLabel12);
        listNameLabel.add(nameLabel13);
        listNameLabel.add(nameLabel14);
        listNameLabel.add(nameLabel15);
        
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

                
        List<Client> dbClient = booking.readClient(); 
        dbClient.stream().forEach((c) -> {
            boxClient.getItems().add(c.getName());
        });
        
        bookDatePicker.setValue(LocalDate.now(ZoneId.of("Brazil/East")));
        bookDatePicker.setEditable(false);
                  
        boxRoom.setItems(FXCollections.observableArrayList("room 01", "room 02", "room 03"
        , "room 04", "room 05", "room 06", "room 07", "room 08", "room 09", "room 10"
        , "room 11", "room 12", "room 13", "room 14", "room 15"));
        
        List<Room> dbRoom = booking.readRoom();
        boxRoom.getSelectionModel().selectedIndexProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            int number = (int) newValue;
            if(number < 0){
                roomPaneLabel.setText("");
            }else {
                int number2 = number+1;
                if (number >= 10) {
                    roomPaneLabel.setText("Room: " + number2);
                } else{
                    roomPaneLabel.setText("Room: 0" + number2);
                }  
                Room room = dbRoom.get(number);
                int situation = room.getSituation();
                switch(situation) {
                    case 0:
                        bookDatePicker.setValue(LocalDate.now(ZoneId.of("Brazil/East")));
                        bookDatePicker.setEditable(false);                       
                        
                        break;
                    case 1:
                        Date dateBook = room.getBookDate();
                        String textBook = dateBook.toString();
                        bookDatePicker.setValue(LocalDate.parse(textBook));
                        bookDatePicker.setEditable(false);
                        
                        Date dateEnter = room.getEnterDate();
                        String textEnter = dateEnter.toString();
                        enterDatePicker.setValue(LocalDate.parse(textEnter));
                        enterDatePicker.setEditable(false);                       
                        
                        Date dateExit = room.getExitDate();
                        String textExit = dateExit.toString();
                        exitDatePicker.setValue(LocalDate.parse(textExit));
                        exitDatePicker.setEditable(false);
                        
                        boxClient.getSelectionModel().select(number);
                        boxClient.setDisable(true);
                                 
                        break;
                    case 2:
                        dateEnter = room.getEnterDate();
                        textEnter = dateEnter.toString();
                        enterDatePicker.setValue(LocalDate.parse(textEnter));
                        enterDatePicker.setEditable(false);
                                              
                        dateExit = room.getExitDate();
                        textExit = dateExit.toString();
                        exitDatePicker.setValue(LocalDate.parse(textExit));
                        exitDatePicker.setEditable(false);
                        
                        break;
                }
            }   
        }); 
        
        enterDatePicker.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                
                Room room = null;
                if(boxRoom.getSelectionModel().getSelectedIndex() >= 0) {
                    room = dbRoom.get(boxRoom.getSelectionModel().getSelectedIndex());
                }
                
                
                long daysBetweenEnterExit = 221;
                long daysBetweenBookEnter = 221;
                if(enterDatePicker.getValue() != null) {
                    daysBetweenBookEnter = DAYS.between(bookDatePicker.getValue(), enterDatePicker.getValue());
                } else{
                }
                if(daysBetweenBookEnter < 0) {
                    messageLabel.setText("Enter can't be before Book date!");
                    messageLabel.getStyleClass().add("errorMessage");
                }else {
                }
  
                if(exitDatePicker.getValue() != null) {
                    daysBetweenEnterExit = DAYS.between(enterDatePicker.getValue(), exitDatePicker.getValue());
                    if(room != null) {
                        dailyAmountText.setText(Float.toString(room.getDailyAmount()));
                        double result = Math.floor(room.getDailyAmount() * daysBetweenEnterExit );
                        totalAmountText.setText(Double.toString(result));
                    }
                }else {      
                }
                if(daysBetweenEnterExit == 0) {
                    messageLabel.setText("Enter and Exit have to be at least one day!");
                    messageLabel.getStyleClass().add("errorMessage");
                }else if(daysBetweenEnterExit > 0){
                }else {
                    messageLabel.setText("Enter can't be after exit!");
                    messageLabel.getStyleClass().add("errorMessage");
                }
                if((daysBetweenEnterExit > 0) && (daysBetweenBookEnter > 0 | daysBetweenBookEnter == 0)) {
                    messageLabel.setText("");
                    messageLabel.getStyleClass().add("cleanMessage");
                }
            }
        });
        
        exitDatePicker.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                
                Room room = null;
                if(boxRoom.getSelectionModel().getSelectedIndex() >= 0) {
                    room = dbRoom.get(boxRoom.getSelectionModel().getSelectedIndex());
                }
                
                long daysBetweenEnterExit = 221;
                if(enterDatePicker.getValue() != null) {
                    daysBetweenEnterExit = DAYS.between(enterDatePicker.getValue(), exitDatePicker.getValue());
                    if(room != null) {
                        dailyAmountText.setText(Float.toString(room.getDailyAmount()));
                        double result = Math.floor(room.getDailyAmount() * daysBetweenEnterExit );
                        totalAmountText.setText(Double.toString(result));
                    }
                }else {
                }
                if(daysBetweenEnterExit == 0) {
                    messageLabel.setText("Enter and Exit have to be at least one day!");
                    messageLabel.getStyleClass().add("errorMessage");
                }else if(daysBetweenEnterExit > 0){
                }else {
                    messageLabel.setText("Enter can't be after exit!");
                    messageLabel.getStyleClass().add("errorMessage");
                }
                if(daysBetweenEnterExit > 0) {
                    messageLabel.setText("");
                    messageLabel.getStyleClass().add("cleanMessage");
                }
            }
        });
        
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
