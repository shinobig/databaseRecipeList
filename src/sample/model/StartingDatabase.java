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
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (0,'Honey'," +
          " 1.3, 'coups', 0)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (1,'Soy " +
          "sauce', 0.25 , 'coups', 0)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (2,'Lemon " +
          "juice', 2 , 'spoons', 0)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (3,'Red " +
          "pepper flakes', 1 , 'table spoons', 0)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (4," +
          "'Extra virgin olive oil', 3 , 'table spoons', 0)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (5,'salmon fillets', 4 , 'oz', 0)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, recipeid) VALUES (6,'Freshly ground black pepper', 0)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (6,'Red" +
          " pepper flakes', 1 , 'table spoons', 0)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (7,'Cloved garlic', 3 , 'pieces', 0)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (8,  " +
          "'Lemon', 1, 'pieces', 0)");


      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (0,'Butter', 2, 'table spoons', 1)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (1," +
          "'Carrot', 2, 'pieces', 1)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (2, " +
          "'Stalk celery', 1, 'piece', 1)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, recipeid) VALUES (3,'Kosher salt', 1)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, recipeid) VALUES (4,'Freshly ground black " +
          "pepper', 1)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES" +
          " (5, 'Cloves garlic', 3, 'pieces', 1)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (6, " +
          "'All-purpose flour', 1, 'table spoon', 1)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (7, " +
          "'Boneless skinless chicken breast', 1.5, 'lb', 1)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, recipeid) VALUES (8,'Bay leaf', 1)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, recipeid) VALUES (9,'Spring fresh thyme', 1)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES" +
          " (10, 'Baby potatos', 0.75, 'lb', 1)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, quantity, typeofquantity, recipeid) VALUES (11, " +
          "'Low-sodium chicken broth', 3, 'c', 1)");
      statement.execute("INSERT INTO ingredients (_id, ingredient, recipeid) VALUES (12,'Freshly chopped parsley', 1)");
*/


  // Iserting steps
/*
      statement.execute("INSERT INTO steps (_id, step, stepindex, recipeid) VALUES (0, 'In a medium bowl, whisk together " +
          "honey, soy sauce, lemon juice and red pepper flakes.', 1, 0)");
      statement.execute("INSERT INTO steps (_id, step, stepindex, recipeid) VALUES (1, 'In a large skillet over medium-high heat, heat two tablespoons oil. When oil is hot but not smoking, add salmon skin-side up and season with salt and pepper. Cook salmon until deeply golden, about 6 minutes, then flip over and add remaining tablespoon of oil.', 2, 0)");

      statement.execute("INSERT INTO steps (_id, step, stepindex, recipeid) VALUES (2, 'Add garlic to the skillet and cook " +
          "until fragrant, 1 minute. Add the honey mixture and sliced lemons and cook until sauce is reduced by about " +
          "1/3. Baste salmon with the sauce.', 3, 0)");

      statement.execute("INSERT INTO steps (_id, step, stepindex, recipeid) VALUES (3, 'Garnish with sliced lemon and " +
          "serve.', 4, 0)");

      statement.execute("INSERT INTO steps (_id, step, stepindex, recipeid) VALUES (4, 'In a large pot over medium " +
          "heat, melt butter. Add carrots and celery and season with salt and pepper. Cook, stirring often, until" +
          " vegetables are tender, about 5 minutes. Add garlic and cook until fragrant, about 30 seconds.', 1, 1)");

      statement.execute("INSERT INTO steps (_id, step, stepindex, recipeid) VALUES (5, 'Add flour and stir until " +
          "vegetables are coated, then add chicken, thyme, bay leaf, potatoes, and broth. Season with salt and " +
          "pepper. Bring mixture to a simmer and cook until the chicken is no longer pink and potatoes are tender, 15 minutes.', 2, 1)");

      statement.execute("INSERT INTO steps (_id, step, stepindex, recipeid) VALUES (6, 'Remove from heat and " +
          "transfer chicken to a medium bowl. Using two forks, shred chicken into small pieces and return to " +
          "pot.', 3, 1)");

      statement.execute("INSERT INTO steps (_id, step, stepindex, recipeid) VALUES (7, 'Garnish with parsley before" +
          " serving.', 4, 1)");
*/

}
