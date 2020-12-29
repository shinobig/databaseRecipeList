package sample.view.recipesView;

import javafx.fxml.FXML;
import sample.model.DataSource;

public class RecipesViewController {


  private DataSource dataSource;

private void initialize(){


  dataSource = new DataSource();
  if (!dataSource.open()) {
    System.out.println("Can't open datasource");
  }

}

@FXML
  public void testControllerRecipeView(){
    System.out.println("Testing recipes view");
  }

}
