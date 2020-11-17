package com.company;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class PremierLeagueGui extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Stage primary = new Stage();
		TableView<SportsClub> tableMember = new TableView<>();
		final ObservableList<SportsClub> observer = FXCollections.observableArrayList(PremierLeagueManager.sportsClubList);

//		TableColumn memberId = new TableColumn("Position"); // Creating Membership Number Column
//		memberId.setCellValueFactory(new PropertyValueFactory("membershipNumber"));

		TableColumn clubName = new TableColumn("Club Name"); // Creating Member Name Column
		clubName.setCellValueFactory(new PropertyValueFactory("nameOfClub"));

		TableColumn played = new TableColumn("Played "); // Creating Member Enrolled Date Column
		played.setCellValueFactory(new PropertyValueFactory("numOfPlayedMatches"));

		TableColumn won = new TableColumn("Won"); // Creating School Name Column
		won.setCellValueFactory(new PropertyValueFactory("numOfWin"));

		TableColumn lost = new TableColumn("Lost"); // Creating School Name Column
		lost.setCellValueFactory(new PropertyValueFactory("numOfDefeat"));

		TableColumn goalsFor = new TableColumn("Goals For"); // Creating Member Age Column
		goalsFor.setCellValueFactory(new PropertyValueFactory("numOfScoredGoals"));

		TableColumn goalsAgainst = new TableColumn("Goals Against"); // Creating Member Age Column
		goalsAgainst.setCellValueFactory(new PropertyValueFactory("numOfReceivedGoals"));

		TableColumn goalsDifference = new TableColumn("Goals Difference"); // Creating Member Age Column
		goalsDifference.setCellValueFactory(new PropertyValueFactory("goalDifference"));

		TableColumn points = new TableColumn("Points"); // Creating Member Age Column
		points.setCellValueFactory(new PropertyValueFactory("numOfPoints"));


		tableMember.setItems(observer);
		tableMember.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		tableMember.getColumns().addAll(clubName,played,won,points,lost,goalsAgainst,goalsDifference);

		tableMember.setMaxSize(600,400);
		VBox tblBox = new VBox();
		tblBox.setSpacing(5);
		tblBox.setPadding(new javafx.geometry.Insets(10,50,50,50));
		tblBox.getChildren().add(tableMember);

		Scene tblScene = new Scene(tblBox,700,500);
		primary.setTitle("Members Details");
		primary.setScene(tblScene);
		primary.sizeToScene();
		primary.show();

	}
}
