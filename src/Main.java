
import java.sql.*;

public class Main {

    private final static String url = "jdbc:postgresql://localhost:5432/2019-05-20_AM_CW";
    private final static String user = "student";
    private final static String password = "C0d3Cr3w";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");




            String SQL = "SELECT code from boxes ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while(rs.next()){
                System.out.println(rs.getString(0));}



        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        connect();
    }
}
//jdbc:postgresql://localhost:5432/postgres