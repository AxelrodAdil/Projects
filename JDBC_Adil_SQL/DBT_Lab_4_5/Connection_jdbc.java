package DBT_Lab_4_5;
import java.sql.*;

public class Connection_jdbc {
    // LAPTOP-QJK3KERN\SQLEXPRESS
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://LAPTOP-QJK3KERN\\SQLEXPRESS;databaseName=Lab_4_5";
        String user = "";
        String password = "";

        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected. NICE!");

            String query_sql = "INSERT INTO ";
            Statement statement = connection.createStatement();
            statement.executeUpdate(query_sql);
        } catch (SQLException e){
            System.out.println("Oops....  ERROR!");
            e.printStackTrace();
        }

    }
}
