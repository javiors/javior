import java.sql.Connection;
import java.sql.DriverManager;


/**
 * Created by javior on 15/6/20.
 */
public class JDBCConnection {

    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3306/mysql?user=root";
            Connection con = DriverManager.getConnection(url);
        }catch (Exception e){
            e.printStackTrace();

        }
    }

    public static void main(String a[]){

    }

}
