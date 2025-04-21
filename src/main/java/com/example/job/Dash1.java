package com.example.job;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Dash1
{
    @javafx.fxml.FXML
    private BorderPane dashboardBP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void profitlossOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Loss.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }

    @javafx.fxml.FXML
    public void prepareSalariesOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("prepare Salaries.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }

    @javafx.fxml.FXML
    public void payementStatusOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Monitor Payment Status.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }

    @javafx.fxml.FXML
    public void signOutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewRevenueOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("View Total Revenue.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }

    @javafx.fxml.FXML
    public void financialRecomndetionOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Financial Recommendations.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }

    @javafx.fxml.FXML
    public void costStatmentOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Monthly and Yearly Cost Statement.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }

    @javafx.fxml.FXML
    public void OverviewOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Update Finance and Accounts Records.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }
}