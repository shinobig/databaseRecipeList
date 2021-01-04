package sample.view.recipesView;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import sample.model.Constants;
import sample.model.DataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RecipesViewController {


  private DataSource dataSource;
  private AllCategories allCategories = new AllCategories();
  private DisplayedRecipes displayedRecipes = new DisplayedRecipes();

  @FXML
  VBox categoriesColumn;
  @FXML
  VBox recipesColumn;
  @FXML
  VBox displayedRecipeColumn;

  public void initialize(int userId) {


    dataSource = new DataSource();
    if (!dataSource.open()) {
      System.out.println("Can't open datasource");
    }

    getCategories(userId);
    displayCategories();
    getAllRecipes(userId);
    showAllRecipes();
    // displayRecipe();
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
          displayRecipe(recipe.getName());
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
    ResultSet allRecipes = dataSource.getAllRecipes(userId);

    try {
      int counter = 0;
      while (allRecipes.next()) {
        ResultSet steps = getRecipeSteps(counter);
        ResultSet ingredients = getIngredients(counter);
        Ingredient ingredientToProcess = new Ingredient();
        Step stepToProcess = new Step();
        displayedRecipes.addRecipeToAll(new Recipe(
            allRecipes.getString(Constants.COLUMN_RECIPES_RECIPE_NAME),
            allRecipes.getString(Constants.COLUMN_CATEGORIES_CATEGORY),
            stepToProcess.processSteps(steps),
            ingredientToProcess.processIngredients(ingredients)
        ));
        counter++;
      }
    } catch (SQLException e) {
      System.out.println("Coudn't set all categories: " + e.getMessage());
    }
  }

  // Button methods
  private void getFilteredCategories(String category) {
    recipesColumn.getChildren().clear();
    displayedRecipes.setDisplayedRecipes(displayedRecipes.setFilteredRecipes(category));
    displayRecipes();
  }

  private ResultSet getRecipeSteps(int recipeId) {
    return dataSource.getSteps(recipeId);
  }


  private ResultSet getIngredients(int recipeId) {
    return dataSource.getIngredients(recipeId);
  }

  private void displayRecipe(String recipeName) {
    Recipe recipeToDisplay = displayedRecipes.getDisplayedRecipes().get(0);
    Label recipeTitle = new Label(recipeToDisplay.getName());
    displayedRecipeColumn.getChildren().add(recipeTitle);

  }

}

