package com.example.demo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class  HelloController extends Application   {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

    }
    @FXML
   private ComboBox typeOfMoneyComboBox;

    @FXML
    private void initalize() {
        typeOfMoneyComboBox.setValue("Currency");
        typeOfMoneyComboBox.setItems(FXCollections.observableArrayList());

    }



  @Override
   public void start(Stage primaryStage) throws Exception {
       ObservableList<String> typeOfMoney = FXCollections.observableArrayList( "USD" , "EUR" , "CNY", "RSD", "NOK");
       ComboBox<String> typeOfMoneyComboBox = new ComboBox<String>(typeOfMoney);
       typeOfMoneyComboBox.setValue("USD");
       Label money = new Label();
        typeOfMoneyComboBox.setOnAction(event -> money.setText(typeOfMoneyComboBox.getValue()));

 }
}
