package sample.view.recipesView;

public class RecipeCategory {

  private String category;
  private String mainColor;
  private String secondaryColor;
  private int id;

  public RecipeCategory(String category, String mainColor, String secondaryColor, int id) {
    this.category = category;
    this.mainColor = mainColor;
    this.secondaryColor = secondaryColor;
    this.id = id;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getMainColor() {
    return mainColor;
  }

  public void setMainColor(String mainColor) {
    this.mainColor = mainColor;
  }

  public String getSecondaryColor() {
    return secondaryColor;
  }

  public void setSecondaryColor(String secondaryColor) {
    this.secondaryColor = secondaryColor;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
