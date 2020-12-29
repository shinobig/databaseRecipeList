package sample.view.recipesView;

import java.util.ArrayList;

public class MeatRecipe extends Recipe {

  String category = "meat";

  public MeatRecipe(String name, ArrayList<Step> allSteps, ArrayList<Ingredient> allIngredients) {
    super(name, allSteps, allIngredients);
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public void setName(String name) {
    super.setName(name);
  }

  @Override
  public ArrayList<Step> getAllSteps() {
    return super.getAllSteps();
  }

  @Override
  public void setAllSteps(ArrayList<Step> allSteps) {
    super.setAllSteps(allSteps);
  }

  @Override
  public ArrayList<Ingredient> getAllIngredients() {
    return super.getAllIngredients();
  }

  @Override
  public void setAllIngredients(ArrayList<Ingredient> allIngredients) {
    super.setAllIngredients(allIngredients);
  }
}
