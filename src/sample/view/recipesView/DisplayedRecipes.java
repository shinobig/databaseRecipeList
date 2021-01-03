package sample.view.recipesView;

import sample.model.Constants;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DisplayedRecipes {

  ArrayList<Recipe> displayedRecipes;
  ArrayList<Recipe> allRecipes;

  public DisplayedRecipes() {
    this.displayedRecipes = new ArrayList<>();
    this.allRecipes = new ArrayList<>();
  }

  public DisplayedRecipes(ArrayList<Recipe> allRecipes) {
    this.allRecipes = allRecipes;
  }

  public DisplayedRecipes(ArrayList<Recipe> displayedRecipes, ArrayList<Recipe> allRecipes) {
    this.displayedRecipes = displayedRecipes;
    this.allRecipes = allRecipes;
  }

  public ArrayList<Recipe> getDisplayedRecipes() {
    return displayedRecipes;
  }

  public void setDisplayedRecipes(ArrayList<Recipe> displayedRecipes) {
    this.displayedRecipes = displayedRecipes;
  }

  public ArrayList<Recipe> getAllRecipes() {
    return allRecipes;
  }

  public void setAllRecipes(ResultSet allRecipes) {

    try {
      while (allRecipes.next()) {
        this.allRecipes.add(
            new Recipe(allRecipes.getString(Constants.COLUMN_RECIPES_RECIPE_NAME))
        );
      }
    } catch (SQLException e) {
      System.out.println("Coudn't set all categories: " + e.getMessage());
    }

  }

  public void addRecipeToAll(Recipe recipeToAdd) {
    allRecipes.add(recipeToAdd);
  }

  public void showAllRecipes(){
    for(Recipe recipe : this.allRecipes){
      System.out.println(recipe.getName());
    }
  }

}
