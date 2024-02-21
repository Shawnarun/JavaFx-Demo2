package Table;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Optional;

public class MainFormController {

    public TableView tblCustomer;
    public TableColumn<CustomerTM,String> colName;
    public TableColumn<CustomerTM,String> colAddress;
    public TableColumn<CustomerTM,String> colNic;
    public TableColumn<CustomerTM,Double> colSalary;
    public TableColumn<CustomerTM, Button> colDelete;


    public void initialize(){
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("btn"));
        loadData();

    }

    ObservableList<CustomerTM> observableList = FXCollections.observableArrayList();
    private void loadData(){
        observableList.clear();
        for(Customer c : Database.customerDataList){
            Button btn = new Button("Delete");
            observableList.add(
                    new CustomerTM(
                            c.getNic(),c.getName(),c.getAddress(),c.getSalary(),btn
                    )
            );

            btn.setOnAction((e)->{

                Alert conf = new Alert(Alert.AlertType.CONFIRMATION,"Are you Sure ?", ButtonType.YES,ButtonType.NO);
                Optional<ButtonType> buttonType = conf.showAndWait();
                if(buttonType.get()== ButtonType.YES){
                    Database.customerDataList.remove(c);
                    loadData();
                }
            });
        }
        tblCustomer.setItems(observableList);
    }
}
