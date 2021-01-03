package sample.view.recipesView;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import sample.model.DataSource;

import java.sql.ResultSet;
import java.util.ArrayList;

public class RecipesViewController {


  private DataSource dataSource;
  private AllCategories allCategories = new AllCategories();
  private DisplayedRecipes displayedRecipes = new DisplayedRecipes();

  @FXML
  VBox categoriesColumn;
  @FXML
  VBox recipesColumn;

  public void initialize(int userId) {


    dataSource = new DataSource();
    if (!dataSource.open()) {
      System.out.println("Can't open datasource");
    }

    getCategories(userId);
    displayCategories();
    getAllRecipes(userId);
    showAllRecipes();
  }

  // DataSource interaction

  private void displayCategories() {

    Button allCategoriesButton = new Button("Show all recipes");
    allCategoriesButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        showAllRecipes();
      }
    });
    categoriesColumn.getChildren().add(allCategoriesButton);

    for (RecipeCategory category : allCategories.getCategories()) {
      Button categoryButton = new Button(category.getCategory());
      categoryButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
          getFilteredCategories(category.getCategory());
        }
      });
      categoriesColumn.getChildren().add(categoryButton);
    }
  }

  private void getCategories(int userId) {
    allCategories.setCategories(dataSource.getAllCategories(userId));
  }


  private void displayRecipes() {
    for (Recipe recipe : displayedRecipes.getDisplayedRecipes()) {
      Button recipeButton = new Button(recipe.getName());
      recipeButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
          System.out.println(recipe.getName());
        }
      });
      recipesColumn.getChildren().add(recipeButton);
    }
  }

  private void showAllRecipes() {
    recipesColumn.getChildren().clear();
    displayedRecipes.setDisplayedRecipes(displayedRecipes.getAllRecipes());
    displayRecipes();
  }

  private void getAllRecipes(int userId) {
    ResultSet allrecipes = dataSource.getAllRecipes(userId);
    displayedRecipes.setAllRecipes(allrecipes);
  }

  // Button methods
  private void getFilteredCategories(String category) {
    recipesColumn.getChildren().clear();
    displayedRecipes.setDisplayedRecipes(displayedRecipes.setFilteredRecipes(category));
    displayRecipes();
  }

  private void getRecipe(){

  }

  private void displayRecipe(){
    
  }

}

