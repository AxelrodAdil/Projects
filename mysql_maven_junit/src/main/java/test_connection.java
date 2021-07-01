import java.sql.*;

/**
 * @Author Adil
 * @create 01.07.2021 22:10
 */
public class test_connection {
    // jdbc:mysql://localhost:3306/?user=root
    /*
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.23</version>
        </dependency>
    </dependencies>
     */

    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/test_mysql";
        String user="root";
        String password="AdilMyktybek08";
        Connection con = null;
        Statement stmt = null;

        try{
            // Class.forName("com.mysql.jdbc.Driver");
            // Loading class `com.mysql.jdbc.Driver'. This is deprecated.
            // The new driver class is `com.mysql.cj.jdbc.Driver'.
            // The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary
            con= DriverManager.getConnection(url,user,password);
            stmt=con.createStatement();

            /*String sqlQuery1="INSERT INTO temp_table VALUES (7,'Java', 'is_WORA')";
            stmt.executeUpdate(sqlQuery1);
            System.out.println("Inserted!");*/

            System.out.println("\n------------------------------------------\n");

            String sqlQuery="select * from test_mysql.temp_table";
            ResultSet rs=stmt.executeQuery(sqlQuery);
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));



            /*String sql2="SELECT * from temp_table where idtemp_table=2";
            ResultSet rs=stmt.executeQuery(sql2);
            while(rs.next()){
                //Retrieve by column name
                int idtemp_table  = rs.getInt("idtemp_table");
                String userName = rs.getString("userName");
                String userSurname = rs.getString("userSurname");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }*/


            System.out.println("GJ!!!");
        }catch(SQLException se){
            System.out.println("Catch exception se. JDBC");
            se.printStackTrace();
        }catch(Exception e){
            System.out.println("Catch exception e. Class.forName");
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    con.close();
            }catch(SQLException se){
                System.out.println("Finally exception se. stmt");
                se.printStackTrace();
            }
            try{
                if(con!=null)
                    con.close();
            }catch(SQLException se){
                System.out.println("Finally exception se. conn");
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
