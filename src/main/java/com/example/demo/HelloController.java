package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;
import java.util.Scanner;

public class HelloController {

    @FXML
    private TextField rubleField;
    @FXML
    private ComboBox<String> currencyField;
    @FXML
    private Button currencyConvert;
    @FXML
    private TextField currencyFinalField;

    @FXML
    private void initialize(){
        currencyField.getItems().addAll("USD", "EUR", "GBR", "JPY", "CHF");
        currencyField.setValue("USD");

        currencyConvert.setOnAction(event -> currencyConvertation());
    }
    private void currencyConvertation(){

        try {
            double rubles = Integer.parseInt(rubleField.getText());
            String selectValue = currencyField.getValue();
            Random random = new Random();
            double exchangeRate = random.nextDouble(0.1,3) * rubles;


            switch (selectValue) {
                case "USD":

                    currencyFinalField.setText(String.valueOf(exchangeRate));
                    break;
                case "EUR":
                    currencyFinalField.setText(String.valueOf(exchangeRate));
                    break;
                case "GBR":
                    currencyFinalField.setText(String.valueOf(exchangeRate));
                    break;
                case "JPY":
                    currencyFinalField.setText(String.valueOf(exchangeRate));

                    break;
                case "CHF":
                    currencyFinalField.setText(String.valueOf(exchangeRate));
                    break;
                default:
                    currencyFinalField.setText("Неверный выбор валюты.");
            }

        } catch (Exception e) {
            currencyFinalField.setText("Некорректный ввод.");
        }
    }
}

