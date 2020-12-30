package sample.model;

import java.sql.*;

public class DataSource {

  private Connection conn;

  // Statements
  private PreparedStatement checkUsernamePassword;

  public boolean open() {
    try {
      conn = DriverManager.getConnection(Constants.CONNECTION_STRING);
      Statement statement = conn.createStatement();
      // checkUsernamePassword = conn.prepareStatement();

      // Run this statements the first time only

      // statement.execute("CREATE TABLE users (_id INTEGER, username STRING)");
      // statement.execute("CREATE TABLE passwords (_id INTEGER, password STRING, userid INTEGER)");
      // statement.execute("CREATE TABLE categories (_id INTEGER, category STRING, color STRING, userid INTEGER)");
      // statement.execute("CREATE TABLE recipes (_id INTEGER, recipename STRING, categoryid INTEGER)");
      // statement.execute("CREATE TABLE ingredients (_id INTEGER, ingredient STRING, quantity DOUBLE, typeofquantity STRING, recipeid INTEGER)");
      // statement.execute("CREATE TABLE steps (_id INTEGER, step STRING, stepindex INTEGER, recipeid INTEGER)");

      //statement.execute("ALTER TABLE categories ADD color STRING");

      // Inserting users
      /*
       statement.execute("INSERT INTO users (_id, username) VALUES (0 ,'shinobi')");
        statement.execute("INSERT INTO users (_id, username) VALUES (1 ,'maria')");
        statement.execute("INSERT INTO users (_id, username) VALUES (2 ,'keyzo')");
      */

      // Inserting passwords
      /*
      statement.execute("INSERT INTO passwords (_id, password, userid) VALUES (0 ,'megatonto1', 0)");
      statement.execute("INSERT INTO passwords (_id, password, userid) VALUES (0 ,'mariatest', 1)");
      statement.execute("INSERT INTO passwords (_id, password, userid) VALUES (0 ,'keyzotest', 2)");
*/
      //Inserting categories
      /*
      statement.execute("INSERT INTO categories (_id, category, userid, color) VALUES (0 ,'meat', 0, '#d1c4e9')");
      statement.execute("INSERT INTO categories (_id, category, userid, color) VALUES (1 ,'chicken', 0, '#f8bbd0')");
      statement.execute("INSERT INTO categories (_id, category, userid, color) VALUES (2 ,'pasta', 0, '#b2dfdb')");

      statement.execute("INSERT INTO categories (_id, category, userid, color) VALUES (0 ,'cake', 1, '#ffcdd2')");
      statement.execute("INSERT INTO categories (_id, category, userid, color) VALUES (1 ,'coffee', 1, '#d7ccc8')");
      statement.execute("INSERT INTO categories (_id, category, userid, color) VALUES (2 ,'soup', 1, '#ffecb3')");

      statement.execute("INSERT INTO categories (_id, category, userid, color) VALUES (0 ,'salad', 2, '#c8e6c9')");
      statement.execute("INSERT INTO categories (_id, category, userid, color) VALUES (1 ,'candy', 2, '#f8bbd0')");
      statement.execute("INSERT INTO categories (_id, category, userid, color) VALUES (2 ,'fish', 2, '#bbdefb')");
*/

/*
      public static final String TABLE_USER = "users";
      public static final String TABLE_PASSWORD = "passwords";
      public static final String TABLE_CATEGORY = "categories";
      public static final String TABLE_RECIPES = "recipes";
      public static final String TABLE_INGREDIENTS = "ingredients";
      public static final String TABLE_STEPS = "steps";

   public static final String COLUMN_PASSWORD_PASSWORD = "password";
    public static final String COLUMN_PASSWORD_ID = "_id";
    public static final String COLUMN_PASSWORD_USERID = "userid";

 */


      System.out.println("Successfully connected to DB");
      return true;
    } catch (SQLException e) {
      System.out.println("Couldn't connect to DB: " + e.getMessage());
      return false;
    }
  }

  public void close() {
    try {

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

  public String getUsername() {
    return "a";
  }

  ;

  public String getUserPassword() {
    return "123";
  }

}
