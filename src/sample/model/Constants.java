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

}
