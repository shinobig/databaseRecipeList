package sample.model;

public class StartingDatabase {

  // Run this statements the first time only
/*
      statement.execute("CREATE TABLE users (_id INTEGER, username STRING)");
      statement.execute("CREATE TABLE passwords (_id INTEGER, password STRING, userid INTEGER)");
      statement.execute("CREATE TABLE categories (_id INTEGER, category STRING, color STRING, userid INTEGER)");
      statement.execute("CREATE TABLE recipes (_id INTEGER, recipename STRING, categoryid INTEGER)");
      statement.execute("CREATE TABLE ingredients (_id INTEGER, ingredient STRING, quantity DOUBLE, typeofquantity STRING, recipeid INTEGER)");
      statement.execute("CREATE TABLE steps (_id INTEGER, step STRING, stepindex INTEGER, recipeid INTEGER)");
*/
  //statement.execute("ALTER TABLE categories ADD color STRING");
  // statement.execute("ALTER TABLE categories ADD secondaryColor STRING");

  // Inserting users
/*
      statement.execute("INSERT INTO users (_id, username) VALUES (0 ,'shinobi')");
      statement.execute("INSERT INTO users (_id, username) VALUES (1 ,'maria')");
      statement.execute("INSERT INTO users (_id, username) VALUES (2 ,'keyzo')");


      // Inserting passwords

      statement.execute("INSERT INTO passwords (_id, password, userid) VALUES (0 ,'megatonto1', 0)");
      statement.execute("INSERT INTO passwords (_id, password, userid) VALUES (0 ,'mariatest', 1)");
      statement.execute("INSERT INTO passwords (_id, password, userid) VALUES (0 ,'keyzotest', 2)");
*/
  //Inserting categories
/*
      statement.execute("INSERT INTO categories (_id, category, userid, color, secondaryColor) VALUES (0 ,'meat', 0, " +
          "'#d1c4e9'," +
          " " +
          "'#5e35b1')");
      statement.execute("INSERT INTO categories (_id, category, userid, color, secondaryColor) VALUES (1 ,'chicken', " +
          "0," +
          " " +
          "'#f8bbd0'," +
          " " +
          "'#c2185b')");
      statement.execute("INSERT INTO categories (_id, category, userid, color, secondaryColor) VALUES (2 ,'pasta', 0," +
          " " +
          "'#b2dfdb'," +
          " " +
          "'#00796b')");

      statement.execute("INSERT INTO categories (_id, category, userid, color, secondaryColor) VALUES (0 ,'cake', 1, " +
          "'#ffcdd2'," +
          " " +
          "'#d32f2f')");
      statement.execute("INSERT INTO categories (_id, category, userid, color, secondaryColor) VALUES (1 ,'coffee', " +
          "1," +
          " " +
          "'#d7ccc8'," +
          " " +
          "'#5d4037')");
      statement.execute("INSERT INTO categories (_id, category, userid, color, secondaryColor) VALUES (2 ,'soup', 1, " +
          "'#ffecb3'," +
          " " +
          "'#ffa000')");

      statement.execute("INSERT INTO categories (_id, category, userid, color, secondaryColor) VALUES (0 ,'salad', 2," +
          " " +
          "'#c8e6c9'," +
          " " +
          "'#388e3c')");
      statement.execute("INSERT INTO categories (_id, category, userid, color, secondaryColor) VALUES (1 ,'candy', 2," +
          " " +
          "'#f8bbd0'," +
          " " +
          "'#c2185b')");
      statement.execute("INSERT INTO categories (_id, category, userid, color, secondaryColor) VALUES (2 ,'fish', 2, " +
          "'#bbdefb'," +
          " " +
          "'#1976d2')");
*/

  // Inserting Recipes
/*
statement.execute("INSERT INTO recipes (_id, recipename, categoryid) VALUES (0, 'Honey Garlic Glazed Salmon', 0)");
statement.execute("INSERT INTO recipes (_id, recipename, categoryid) VALUES (0, 'Chicken Stew', 1)");
 */

  // Inserting ingredients
  /*
  statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (0,"Honey", 1.3, 'coups', 0);
  statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (1,"Soy sauce", 0.25 , 'coups', 0);
  statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (2,"Lemon juice", 2 , 'spoons', 0);
  statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (3,"Red
  pepper flakes", 1 , 'table spoons', 0);
  statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (4,"Extra
  virgin olive oil", 3 , 'table spoons', 0);
  statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (5,"salmon fillets", 4 , 'oz', 0);
  statement.execute("INSERT INTO ingredients (_id, ingredient, recipeid) VALUES (6,"Freshly ground black pepper", 0);
  statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (6,"Red
  pepper flakes", 1 , 'table spoons', 0);
  statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (7,"Cloved
  garlic", 3 , 'pieces', 0);
    statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (8,
    "Lemon", 1 , 'pieces', 0);


    

   */
}
