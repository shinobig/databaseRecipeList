package sample.view.addNewRecipeView;

import sample.model.DataSource;

public class AddRecipeDialogController {

  private DataSource dataSource;

  public void initialize(){
    dataSource = new DataSource();
    if (!dataSource.open()) {
      System.out.println("Can't open datasource");
    }
  }

}
