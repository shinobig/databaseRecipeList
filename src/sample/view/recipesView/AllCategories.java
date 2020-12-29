package sample.view.recipesView;

import java.util.ArrayList;

public class AllCategories {

  ArrayList<String> categories;

  public AllCategories(ArrayList<String> categories) {
    this.categories = categories;
  }

  public ArrayList<String> getCategories() {
    return categories;
  }

  public void setCategories(ArrayList<String> categories) {
    this.categories = categories;
  }
}
