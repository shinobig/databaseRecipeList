package sample.view.recipesView;

public class Ingredient {

  String ingredientName;
  double quantity;
  String typeOfQuantity;

  public Ingredient(){};

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
}
