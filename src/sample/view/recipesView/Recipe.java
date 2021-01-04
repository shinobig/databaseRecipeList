package sample.view.recipesView;

import java.util.ArrayList;

public class Recipe {

  private String name;
  private String category;
  private ArrayList<Step> allSteps;
  private ArrayList<Ingredient> allIngredients;

  public Recipe(String name) {
    this.name = name;
  }

  public Recipe(String name, String category) {
    this.name = name;
    this.category = category;
  }

  public Recipe(String name, ArrayList<Step> allSteps, ArrayList<Ingredient> allIngredients) {
    this.name = name;
    this.allSteps = allSteps;
    this.allIngredients = allIngredients;
  }


  public Recipe(String name, String category, ArrayList<Step> allSteps) {
    this.name = name;
    this.category = category;
    this.allSteps = allSteps;
  }

  public Recipe(String name, String category, ArrayList<Step> allSteps, ArrayList<Ingredient> allIngredients) {
    this.name = name;
    this.category = category;
    this.allSteps = allSteps;
    this.allIngredients = allIngredients;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
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
