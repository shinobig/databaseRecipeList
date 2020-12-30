package sample.view.recipesView;

import javafx.fxml.FXML;
import sample.model.DataSource;

import java.util.ArrayList;

public class RecipesViewController {


  private DataSource dataSource;
  private AllCategories allCategories;
  private DisplayedRecipes displayedRecipes;

  private void initialize() {

    dataSource = new DataSource();
    if (!dataSource.open()) {
      System.out.println("Can't open datasource");
    }

  }

  @FXML
  public void testControllerRecipeView() {
    System.out.println("Testing recipes view");
  }


  // DataSource interaction


  private void showAllRecipes() {
  }

  private void displayFilteredRecipes() {
  }

  private ArrayList<String> filterRecipes() {
    return null;
  }



  // TESTING
  // Create test recipe

  public void createTestRecipe(String name, ArrayList<Step> allSteps, ArrayList<Ingredient> ingredients){
    Recipe testRecipe = new Recipe(name, allSteps, ingredients);
    displayedRecipes.addRecipeToAll(testRecipe);
  }

  public Ingredient createIngredient(){
    Ingredient ingredientToCreate = new Ingredient();
  }


}
