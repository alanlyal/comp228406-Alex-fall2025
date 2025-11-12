package org.example;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
public class Student{
    @FXML private TextField Name;
    @FXML private TextField Address;
    @FXML private TextField City;
    @FXML private TextField Province;
    @FXML private TextField PostalCode;
    @FXML private TextField PhoneNum;
    @FXML private TextField Email;
    @FXML private RadioButton ComScien;
    @FXML private RadioButton Business;
    @FXML private ComboBox<String> selectClass;
    @FXML private  ListView<String> List;
    @FXML private CheckBox Volunteer;
    @FXML private CheckBox Work;
    @FXML private CheckBox Research;
    @FXML private TextArea Output;
    private final ObservableList<String> computer = FXCollections.observableArrayList("c#","java","other");
    private final ObservableList<String> business= FXCollections.observableArrayList("marketing","accounting", "other");
    @FXML
    private void initialize(){
        ToggleGroup group = new ToggleGroup();
        ComScien.setToggleGroup(group);
        Business.setToggleGroup(group);
        ComScien.setOnAction(event -> setcomputerClasses());
        Business.setOnAction(event -> setbusinessClasses());
    }
    private void setcomputerClasses(){
        selectClass.setItems(computer);
    }
    private void setbusinessClasses() {
        selectClass.setItems(business);
    }
    @FXML
    private void addClasses()
    {
        String classes = selectClass.getValue();
        if (classes != null && !List.getItems().contains(classes)){
            List.getItems().add(classes);
        }
    }
    @FXML
    private void displayStudentInfo(){
        StringBuilder info = new StringBuilder();
        info.append("full name (first and last name): ").append(Name.getText()).append("\n");
        info.append("address: ").append(Address.getText()).append("\n");
        info.append("city: ").append(City.getText()).append("\n");
        info.append("province: ").append(Province.getText()).append("\n");
        info.append("postal code: ").append(PostalCode.getText()).append("\n");
        info.append("phone Number: ").append(PhoneNum.getText()).append("\n");
        info.append("email: ").append(Email.getText()).append("\n");
        Output.setText(info.toString());
    }
}