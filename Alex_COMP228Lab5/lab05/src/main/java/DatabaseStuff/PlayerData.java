package DatabaseStuff;
import java.sql.*;
public class PlayerData {
    private final Connection connection = DBConnect.getConnection();

    public boolean putPlayer(String firstName, String lastName, String address, String postalcode) {
        String sql = "INSERT INTO \"Player\" (\"First_Name\", \"Last_name\", \"Address\", \"Postal_Code\") VALUES (?, ?, ?, ?)";// this type of line I had to look up as it keeped giving me error
        try (PreparedStatement data = connection.prepareStatement(sql)) {
            data.setString(1, firstName);
            data.setString(2, lastName);
            data.setString(3, address);
            data.setString(4, postalcode);
            return data.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public int getPlayerIdByName(String firstName, String lastName) {
        String sql = "SELECT \"Player_id\" FROM \"Player\" WHERE \"First_Name\" = ? AND \"Last_name\" = ?"; // this type of line I had to look up as it keeped giving me error
        try (PreparedStatement data = connection.prepareStatement(sql)) {
            data.setString(1, firstName);
            data.setString(2, lastName);
            try (ResultSet rs = data.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("Player_id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

