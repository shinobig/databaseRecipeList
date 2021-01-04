package sample.model;

public class Constants {

  public static final String DB_NAME = "recipes.db";
  public static final String CONNECTION_STRING = "jdbc:sqlite:" + DB_NAME;
  public static final String TABLE_USER = "users";
  public static final String TABLE_PASSWORD = "passwords";
  public static final String TABLE_CATEGORY = "categories";
  public static final String TABLE_RECIPES = "recipes";
  public static final String TABLE_INGREDIENTS = "ingredients";
  public static final String TABLE_STEPS = "steps";

  // User table columns
  public static final String COLUMN_USER_USERNAME = "username";
  public static final String COLUMN_USER_ID = "_id";

  // Password table columns
  public static final String COLUMN_PASSWORD_PASSWORD = "password";
  public static final String COLUMN_PASSWORD_ID = "_id";
  public static final String COLUMN_PASSWORD_USERID = "userid";

  // Categories table columns
  public static final String COLUMN_CATEGORIES_ID = "_id";
  public static final String COLUMN_CATEGORIES_CATEGORY = "category";
  public static final String COLUMN_CATEGORIES_COLOR = "color";
  public static final String COLUMN_CATEGORIES_USERID = "userid";
  public static final String COLUMN_CATEGORIES_SECONDARY_COLOR = "secondaryColor";

  // Recipes table columns
  public static final String COLUMN_RECIPES_ID = "_id";
  public static final String COLUMN_RECIPES_RECIPE_NAME = "recipename";
  public static final String COLUMN_RECIPES_CATEGORYID = "categoryid";
  public static final String COLUMN_RECIPES_USERID = "userid";

  // Ingredients table columns
  public static final String COLUMN_INGREDIENTS_ID = "_id";
  public static final String COLUMN_INGREDIENTS_INGREDIENT_NAME = "ingredient";
  public static final String COLUMN_INGREDIENTS_QUANTITY = "quantity";
  public static final String COLUMN_INGREDIENTS_TYPE_OF_QUANTITY = "typeofquantity";
  public static final String COLUMN_INGREDIENTS_RECIPE_ID = "recipeid";

  // Steps table columns
  public static final String COLUMN_STEPS_ID = "_id";
  public static final String COLUMN_STEPS_STEP = "step";
  public static final String COLUMN_STEPS_STEP_INDEX = "stepindex";
  public static final String COLUMN_STEPS_RECIPE_ID = "recipeid";

  // Users query
  public static final String CHECK_USERNAME = "SELECT * FROM " + TABLE_USER + " WHERE " + COLUMN_USER_USERNAME + " = ?";

  // Password query
  public static final String CHECK_PASSWORD = "SELECT " + COLUMN_PASSWORD_PASSWORD + " FROM " + TABLE_PASSWORD + " " +
      "INNER JOIN " + TABLE_USER + " ON " + TABLE_PASSWORD + "." + COLUMN_PASSWORD_USERID + " = " + TABLE_USER + "." + COLUMN_USER_ID + " WHERE " + COLUMN_PASSWORD_USERID + " = ?";

  // Categories query
  public static final String GET_CATEGORIES = "SELECT * FROM " + TABLE_CATEGORY + " INNER JOIN " + TABLE_USER + " ON " + TABLE_CATEGORY + "." + COLUMN_CATEGORIES_USERID + " = " + TABLE_USER + "." + COLUMN_USER_ID + " WHERE " + COLUMN_PASSWORD_USERID + " = ?";

  // Recipes query
  public static final String GET_RECIPES =
      "SELECT " + TABLE_RECIPES + "." + COLUMN_RECIPES_RECIPE_NAME + ", " +
          TABLE_CATEGORY + "." + COLUMN_CATEGORIES_CATEGORY + ", " +
          TABLE_RECIPES + "." + COLUMN_RECIPES_USERID + " FROM " + TABLE_RECIPES + " INNER JOIN " + TABLE_CATEGORY +
          " ON " + TABLE_RECIPES + "." + COLUMN_RECIPES_CATEGORYID + " = " + TABLE_CATEGORY + "." + COLUMN_CATEGORIES_ID + " INNER JOIN " + TABLE_USER + " ON " + TABLE_CATEGORY + "." + COLUMN_CATEGORIES_USERID + " = " + TABLE_USER + "." + COLUMN_USER_ID + " WHERE " + TABLE_USER + "." + COLUMN_USER_ID + " = ?";

  public static final String GET_STEPS = "SELECT * FROM " + TABLE_STEPS + " WHERE " + COLUMN_STEPS_RECIPE_ID + " = ? " +
      "ORDER BY " + COLUMN_STEPS_STEP_INDEX;

  public static final String GET_INGREDIENTS =
      "SELECT * FROM " + TABLE_INGREDIENTS + " WHERE " + COLUMN_INGREDIENTS_RECIPE_ID +
          " = ? ORDER BY " + COLUMN_INGREDIENTS_ID;

}
