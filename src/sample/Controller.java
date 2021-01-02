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
import sample.view.recipesView.Recipe;
import sample.view.recipesView.RecipesViewController;

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
      String username = usernameTextArea.getText().trim();
      showRecipesView(getUserId(username));
    } else {
      System.out.println("Please insert new username or ps");
    }
  }
  @FXML
  private void showRecipesView(int userId) {
    dataSource.close();
    try {

      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/recipesView/recipesView.fxml"));
      Parent root1 = fxmlLoader.load();
      Stage stage = new Stage();
      stage.setTitle("Welcome!");
      Scene scene = new Scene(root1, 900, 500);
      RecipesViewController recipesViewController = fxmlLoader.getController();
      recipesViewController.initialize(userId);
      stage.setScene(scene);

      stage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  private boolean checkLogin() {
    String username = usernameTextArea.getText().trim();
    String password = passwordArea.getText().trim();
    int storedUserId = getUserId(username);
    String storedPassword = dataSource.getPassword(storedUserId);

    if (storedPassword != null) {
      if (password.equals(storedPassword)) {
        return true;
      }
      System.out.println("Wrong password");
      return false;
    }
    System.out.println("No user found");
    return false;
  }

  private int getUserId (String username){
    return dataSource.getUsername(username);
  }




  // Testing methods
public void showRecipesViewTest (){
    showRecipesView(0);
  }


}
