package sample.view.recipesView;

import sample.model.Constants;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AllCategories {

  ArrayList<RecipeCategory> categories;

  public AllCategories() {
    this.categories = new ArrayList<>();
  }

  public ArrayList<RecipeCategory> getCategories() {
    return categories;
  }

  public void setCategories(ResultSet allCategories) {

    System.out.println("Checking all categories");

    try {
      while (allCategories.next()) {
        this.categories.add(
            new RecipeCategory(
                allCategories.getString(Constants.COLUMN_CATEGORIES_CATEGORY),
                allCategories.getString(Constants.COLUMN_CATEGORIES_COLOR),
                allCategories.getString(Constants.COLUMN_CATEGORIES_SECONDARY_COLOR),
                allCategories.getInt(Constants.COLUMN_CATEGORIES_ID)
            )
        );
      }
    } catch (SQLException e) {
      System.out.println("Couldn't set categories: " + e.getMessage());
    }

  }
  public void showCategories(){
    for(RecipeCategory recipeCategory:  this.categories ){
      System.out.println(recipeCategory.getCategory());
    };
  }

  public void addCategory(RecipeCategory categoryToAdd) {



  }
}
