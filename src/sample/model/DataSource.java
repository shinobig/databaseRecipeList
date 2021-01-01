package sample.model;

import java.sql.*;

public class DataSource {

  private Connection conn;

  // Statements
  private PreparedStatement returnUsername;
  private PreparedStatement returnPassword;

  public boolean open() {
    try {
      conn = DriverManager.getConnection(Constants.CONNECTION_STRING);
      Statement statement = conn.createStatement();
      returnUsername = conn.prepareStatement(Constants.CHECK_USERNAME);
      returnPassword = conn.prepareStatement(Constants.CHECK_PASSWORD);




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
    try{
      returnUsername.setString(1, insertedUsername);
      ResultSet resultSet = returnUsername.executeQuery();
      if(resultSet.getString(Constants.COLUMN_USER_USERNAME) != null){
        return resultSet.getInt(Constants.COLUMN_USER_ID);
      } else {
        return -1;
      }
    } catch (SQLException e){
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

}
