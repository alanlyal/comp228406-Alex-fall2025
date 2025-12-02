package DatabaseStuff;
import model.Game;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class GameData {
    private final Connection connection = DBConnect.getConnection();
    public List<Game> getAllGames(){
        List<Game> games = new ArrayList<>();
        String sql = "SELECT \"Game_id\", \"Game_Title\" FROM \"Game\""; // this type of line I had to look up as it keeped giving me error
        // I know why its giving me the error its because I messed up my database I gave each column capital letters I cant change
        //it as it gave me warnings of confliction so as mention I looked up other ways to do it this goes to every line like this
        try (PreparedStatement data = connection.prepareStatement(sql);
             ResultSet rs = data.executeQuery()){
            while (rs.next()){
                int id = rs.getInt("Game_id");
                String title = rs.getString("Game_Title");
                games.add(new Game(title, id));

            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return games;
    }
}
