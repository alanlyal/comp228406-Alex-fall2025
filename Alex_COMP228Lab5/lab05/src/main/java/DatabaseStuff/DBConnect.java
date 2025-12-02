package DatabaseStuff;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnect {
    public static final String URL = "jdbc:postgresql://aws-1-us-east-2.pooler.supabase.com:5432/postgres?user=postgres.odaumpmbktlhzdkklmek&password=Pilot2025202603";
    private static Connection connection;
public static Connection getConnection(){
    if (connection == null){
        try{
            connection = DriverManager.getConnection(URL);
            System.out.println("BD is connected");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("BD is not connected");
        }
    }
    return connection;
    }
}


