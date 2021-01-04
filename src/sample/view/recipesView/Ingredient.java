package sample.view.recipesView;

import sample.model.Constants;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Ingredient {

  String ingredientName;
  double quantity;
  String typeOfQuantity;

  public Ingredient() {
  }

  ;

  public Ingredient(String ingredientName) {
    this.ingredientName = ingredientName;
  }

  public Ingredient(String ingredientName, double quantity, String typeOfQuantity) {
    this.ingredientName = ingredientName;
    this.quantity = quantity;
    this.typeOfQuantity = typeOfQuantity;
  }

  public String getIngredientName() {
    return ingredientName;
  }

  public void setIngredientName(String ingredientName) {
    this.ingredientName = ingredientName;
  }

  public double getQuantity() {
    return quantity;
  }

  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }

  public String getTypeOfQuantity() {
    return typeOfQuantity;
  }

  public void setTypeOfQuantity(String typeOfQuantity) {
    this.typeOfQuantity = typeOfQuantity;
  }

  public ArrayList<Ingredient> processIngredients(ResultSet ingredients) {
    ArrayList<Ingredient> ingredientsToAdd = new ArrayList<>();
    try {
      while (ingredients.next()) {
        ingredientsToAdd.add(
            new Ingredient(
                ingredients.getString(Constants.COLUMN_INGREDIENTS_INGREDIENT_NAME),
                ingredients.getDouble(Constants.COLUMN_INGREDIENTS_QUANTITY),
                ingredients.getString(Constants.COLUMN_INGREDIENTS_TYPE_OF_QUANTITY)
            )
        );

      }
      return ingredientsToAdd;

    } catch (SQLException e) {
      System.out.println("Couldn't process ingredients: " + e.getMessage());
      return null;
    }
  }
}
