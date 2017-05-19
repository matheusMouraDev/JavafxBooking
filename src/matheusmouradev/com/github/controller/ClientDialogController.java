
package matheusmouradev.com.github.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import matheusmouradev.com.github.data.Client;
import matheusmouradev.com.github.data.Room;
import matheusmouradev.com.github.facade.Booking;

public class ClientDialogController implements Initializable{

    Booking booking = new Booking();
    
    @FXML private BorderPane basePane;
    
    @FXML private TableView<Client> table;
    @FXML private TableColumn<Client, Room> columnRoom;
    
    @FXML private Button selectBtn;
    
    @FXML private void selectBtnHandler(ActionEvent event) {
        Platform.exit();
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        columnRoom.setCellValueFactory(new PropertyValueFactory<>("room"));
        columnRoom.setCellFactory(new Callback<TableColumn<Client, Room>,TableCell<Client, Room>>() {
            @Override
            public TableCell<Client, Room> call(TableColumn<Client, Room> param){
                TableCell<Client, Room> roomCell = new TableCell<Client, Room>(){
                    @Override
                    protected void updateItem(Room item, boolean empty) {
                        if(item !=null) {
                            Label roomLabel = new Label("Already has a Room");
                            setGraphic(roomLabel);
                        }
                    }
                };
                return roomCell;
            }
        });
        
        List<Client> dbClient = booking.readClient();
        table.setItems(FXCollections.observableArrayList(dbClient));
    }
    
}
