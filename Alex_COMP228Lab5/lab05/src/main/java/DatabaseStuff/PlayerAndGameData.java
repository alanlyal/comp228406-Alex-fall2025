package DatabaseStuff;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerAndGameData {
    private final Connection connection = DBConnect.getConnection();

    public boolean assignGameToPlayer(int playerId, int gameId, Date playingDate, int score) {
        String sql = "INSERT INTO \"PlayerAndGame\" (\"Player_id\", \"Game_id\", \"Playing_date\", \"Score\") VALUES (?, ?, ?, ?)";// this type of line I had to look up as it keeped giving me error
        try (PreparedStatement data = connection.prepareStatement(sql)) {
            data.setInt(1, playerId);
            data.setInt(2, gameId);
            data.setDate(3, playingDate);
            data.setInt(4, score);
            return data.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public List<Integer> getGamesByPlayer(int playerId) {
        List<Integer> games = new ArrayList<>();
        String sql = "SELECT \"Game_id\" FROM \"PlayerAndGame\" WHERE \"Player_id\" = ?";// this type of line I had to look up as it keeped giving me error
        try (PreparedStatement data = connection.prepareStatement(sql)){
            data.setInt(1,playerId);
            try(ResultSet rs = data.executeQuery()){
                while (rs.next()){
                    games.add(rs.getInt("Game_id"));
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return games;
    }

    public List<Integer> getPlayersByGame(int gameId) {
    List<Integer> players = new ArrayList<>();
    String sql = "SELECT \"Player_id\" FROM \"PlayerAndGame\" WHERE \"Game_id\" = ?";// this type of line I had to look up as it keeped giving me error
    try(PreparedStatement data = connection.prepareStatement(sql)){
        data.setInt(1,gameId);
        try(ResultSet rs = data.executeQuery()){
            while(rs.next()){
                players.add(rs.getInt("Player_id"));
            }
        }
    } catch (SQLException e){
        e.printStackTrace();
    }
        return players;
    }
}