package ui.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import business.LoginException;
import business.controllers.impl.SystemController;
import business.controllers.interfaces.ControllerInterface;
import javafx.event.ActionEvent; 
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LibrarianWindowController implements Initializable {

	@FXML
	private MenuItem exitMenuItem;

	@FXML
	private Button loginButton;

	@FXML
	private TextField usernameTextField;

	@FXML
	private PasswordField passwordTextField;
	
	@FXML
	private Label errorLabel;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	public void exitApplication(ActionEvent event) {
		System.out.println("Application Exit!");

		System.exit(0);

	}
	
	public void openCheckout(ActionEvent event) {
		WindowController.openWindow("CheckoutWindow", event, this.getClass());

	}
	
	public void logout(ActionEvent event) {
		SystemController.currentLoggedInUser = null ;
		WindowController.openPopus("MainWindow", event, this.getClass());
	}
	
	public void openBooks(ActionEvent event) {
		WindowController.openWindow("ListBooksWindow", event, this.getClass());

	}
	
	public void openMembers(ActionEvent event) {
		WindowController.openWindow("ListMembersWindow", event, this.getClass());

	}
	
	public void openCheckoutRecords(ActionEvent event) {
		WindowController.openWindow("ListCheckoutsWindow", event, this.getClass());

	}

	

}
