package sample;

import javafx.fxml.FXML;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.model.DataSource;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {

  private DataSource dataSource;

  @FXML
  private TextField usernameTextArea;
  @FXML
  private PasswordField passwordArea;
  @FXML
  private Button loginBtn;

  public void initialize() {
    dataSource = new DataSource();
    if (!dataSource.open()) {
      System.out.println("Can't open datasource");
    }
  }

  @FXML
  private void handleLogin() {


    if (checkLogin()) {
      showRecipesView();
    } else {
      System.out.println("Please insert new username or ps");
    }
  }

  @FXML
  private void showRecipesView() {
    dataSource.close();
    try {

      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/recipesView/recipesView.fxml"));
      Parent root1 = (Parent) fxmlLoader.load();
      Stage stage = new Stage();
      stage.setTitle("Welcome!");
      stage.setScene(new Scene(root1, 900, 500));
      stage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  private boolean checkLogin() {
    String username = usernameTextArea.getText().trim();
    String password = passwordArea.getText().trim();
    String storedUsername = dataSource.getUsername();
    String storedPassword = dataSource.getUserPassword();
    return (username.equals(storedUsername)) && (password.equals(storedPassword));
  }


}
