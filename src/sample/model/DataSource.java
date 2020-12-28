package sample.model;
import java.sql.*;

public class DataSource {

    private Connection conn;

    public boolean open(){
        try{
            conn = DriverManager.getConnection(Constants.CONNECTION_STRING);
            Statement statement = conn.createStatement();
            System.out.println("Successfully connected to DB");
            return true;
        } catch (SQLException e){
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

}
