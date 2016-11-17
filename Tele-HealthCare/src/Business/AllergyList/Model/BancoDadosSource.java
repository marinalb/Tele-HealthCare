package Business.AllergyList.Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.sql.DataSource;


/**
 * @author Conrado Werlang
 * @author Gabriel Mattos
 * @author Marina Barros
 */

public class BancoDadosSource {
    
    public static String DB_CONN_STRING = "jdbc:derby://localhost:1527/allergy";
    public static String DB_NAME = "allergy";
    public static String USER_NAME = "";
    public static String PASSWORD = "";
    private static DataSource dataSource;
    
    public static Connection conectarBd() throws Exception {
        return DriverManager.getConnection(DB_CONN_STRING, USER_NAME, PASSWORD);
    }
    
    
}
