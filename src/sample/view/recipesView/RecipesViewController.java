package sample.view.recipesView;

import javafx.fxml.FXML;
import sample.model.DataSource;

import java.sql.ResultSet;
import java.util.ArrayList;

public class RecipesViewController {


  private DataSource dataSource;
  private AllCategories allCategories = new AllCategories();
  private DisplayedRecipes displayedRecipes;

  public void initialize(int userId) {


    dataSource = new DataSource();
    if (!dataSource.open()) {
      System.out.println("Can't open datasource");
    }

    System.out.println(userId);
    getCategories(userId);


  }

  // DataSource interaction

  private void displayCategories() {

  }

  private void getCategories(int userId) {
    ResultSet testResult = dataSource.getAllCategories(userId);
    allCategories.setCategories(testResult);
  }


  private void showAllRecipes() {
  }

  private void displayFilteredRecipes() {
  }

  private ArrayList<String> filterRecipes() {
    return null;
  }

}
