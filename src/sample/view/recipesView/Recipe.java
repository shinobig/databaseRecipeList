package sample.view.recipesView;

import java.util.ArrayList;

public class Recipe {

  String name;
  ArrayList<Step> allSteps;
  ArrayList<Ingredient> allIngredients;

  public Recipe(String name, ArrayList<Step> allSteps, ArrayList<Ingredient> allIngredients) {
    this.name = name;
    this.allSteps = allSteps;
    this.allIngredients = allIngredients;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Step> getAllSteps() {
    return allSteps;
  }

  public void setAllSteps(ArrayList<Step> allSteps) {
    this.allSteps = allSteps;
  }

  public ArrayList<Ingredient> getAllIngredients() {
    return allIngredients;
  }

  public void setAllIngredients(ArrayList<Ingredient> allIngredients) {
    this.allIngredients = allIngredients;
  }
}
