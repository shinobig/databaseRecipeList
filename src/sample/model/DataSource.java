package sample.model;

import javafx.scene.control.ContextMenu;
import sample.view.recipesView.RecipeCategory;

import java.sql.*;
import java.util.ArrayList;
import java.util.Locale;

public class DataSource {

  private Connection conn;

  // Statements
  private PreparedStatement returnUsername;
  private PreparedStatement returnPassword;
  private PreparedStatement returnCategories;
  private PreparedStatement returnRecipes;
  private PreparedStatement returnSteps;
  private PreparedStatement returnIngredients;


  public boolean open() {
    try {
      conn = DriverManager.getConnection(Constants.CONNECTION_STRING);
      Statement statement = conn.createStatement();

      returnUsername = conn.prepareStatement(Constants.CHECK_USERNAME);
      returnPassword = conn.prepareStatement(Constants.CHECK_PASSWORD);
      returnCategories = conn.prepareStatement(Constants.GET_CATEGORIES);
      returnRecipes = conn.prepareStatement(Constants.GET_RECIPES);
      returnSteps = conn.prepareStatement(Constants.GET_STEPS);
      returnIngredients = conn.prepareStatement(Constants.GET_INGREDIENTS);


      System.out.println("Successfully connected to DB");
      return true;
    } catch (SQLException e) {
      System.out.println("Couldn't connect to DB: " + e.getMessage());
      return false;
    }
  }

  public void close() {
    try {

      closeQuery(returnUsername);
      closeQuery(returnPassword);
      closeQuery(returnCategories);
      closeQuery(returnRecipes);
      closeQuery(returnSteps);
      closeQuery(returnIngredients);

      if (conn != null) {
        conn.close();
      }
    } catch (SQLException e) {
      System.out.println("Couldn't close connection: " + e.getMessage());
    }
  }

  private void closeQuery(PreparedStatement preparedStatement) {
    try {
      if (preparedStatement != null) {
        preparedStatement.close();
      }
    } catch (SQLException e) {
      System.out.println("Couldn't close connection: " + e.getMessage());
    }
  }

  public int getUsername(String insertedUsername) {
    try {
      returnUsername.setString(1, insertedUsername);
      ResultSet resultSet = returnUsername.executeQuery();
      if (resultSet.getString(Constants.COLUMN_USER_USERNAME) != null) {
        return resultSet.getInt(Constants.COLUMN_USER_ID);
      } else {
        return -1;
      }
    } catch (SQLException e) {
      System.out.println("No username found: " + e.getMessage());
      return -1;
    }
  }

  public String getPassword(int usernameId) {
    try {
      returnPassword.setString(1, String.valueOf(usernameId));
      ResultSet resultSet = returnPassword.executeQuery();
      return resultSet.getString(Constants.COLUMN_PASSWORD_PASSWORD);
    } catch (SQLException e) {
      System.out.println("Error processing password: " + e.getMessage());
    }
    return null;
  }

  public ResultSet getAllCategories(int userID) {
    try {
      returnCategories.setString(1, String.valueOf(userID));
      ResultSet resultSet = returnCategories.executeQuery();
      return resultSet;
    } catch (SQLException e) {
      System.out.println("Couln't get the categories: " + e.getMessage());
    }
    return null;
  }

  public ResultSet getAllRecipes(int userId) {
    try {
      returnRecipes.setString(1, String.valueOf(userId));
      return returnRecipes.executeQuery();
    } catch (SQLException e) {
      System.out.println("Couldn't return recipes: " + e.getMessage());
    }
    return null;
  }

  public ResultSet getSteps(int recipeId) {
    try {
      returnSteps.setString(1, String.valueOf(recipeId));
      return returnSteps.executeQuery();
    } catch (SQLException e) {
      System.out.println("Couldn't get steps: " + e.getMessage());
    }

    return null;
  }

  public ResultSet getIngredients(int recipeId) {
    try {
      returnIngredients.setString(1, String.valueOf(recipeId));
      return returnIngredients.executeQuery();
    } catch (SQLException e) {
      System.out.println("Couldn't get ingredients: " + e.getMessage());
    }

    return null;
  }

}
