package sample.view.recipesView;

import java.util.ArrayList;

public class DisplayedRecipes {

  ArrayList<Recipe> displayedRecipes;
  ArrayList<Recipe> allRecipes;

  public DisplayedRecipes() {}

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

  public void setAllRecipes(ArrayList<Recipe> allRecipes) {
    this.allRecipes = allRecipes;
  }

  public void addRecipeToAll(Recipe recipeToAdd){
    allRecipes.add(recipeToAdd);
  }

}
