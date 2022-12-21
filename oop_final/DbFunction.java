

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbFunction {
    public Connection connect_to_db(String dbname, String user, String pass) {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname, user, pass);
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }

    public Boolean login_director(Connection connection, String user, String password,String role) {
        Statement statement;
        ResultSet result = null;
        try {
            String query = String.format("SELECT * FROM person WHERE name = '%s' AND password = '%s' AND role = '%s'", user, password,role);
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while (result.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
