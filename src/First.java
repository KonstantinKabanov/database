import java.sql.*;



/**
 * Created by Костя on 17.02.2017.
 */
public abstract class First {

    public static void main(String[] args) throws SQLException {
        Connection conn;
        Statement st;
        ResultSet rs;


        try {
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Костя\\Desktop\\test.db");
            st = conn.createStatement();
            String query = "select * from 'table'";
            rs = st.executeQuery(query);
            while (rs.next()) {
                int id;
                String name;
                String number;
                id = rs.getInt(1);
                name = rs.getString(2);
                number = rs.getString(3);
                Product product = new Product(id, name, number);
                System.out.println(product);

            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}