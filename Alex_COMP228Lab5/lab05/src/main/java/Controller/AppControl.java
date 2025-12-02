package Controller;
import DatabaseStuff.GameData;
import DatabaseStuff.PlayerData;
import DatabaseStuff.PlayerAndGameData;
import model.Game;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.sql.Date;
public class AppControl {
    @FXML private Label status;
    @FXML private ComboBox<Game> gameComboBox;
    @FXML private TextField firstName;
    @FXML private TextField lastName;
    @FXML  private TextField address;
    @FXML private TextField postalCode;
    @FXML private DatePicker date;
    @FXML
    private TextField score;
    private final GameData gameData = new GameData();
    private final PlayerData playerData = new PlayerData();
    private final PlayerAndGameData playerAndGameData = new PlayerAndGameData();
    @FXML
    public void initialize() {
        gameComboBox.getItems().setAll(gameData.getAllGames());
    }
    @FXML
    private void addPlayer() {
        boolean success = playerData.putPlayer(firstName.getText(), lastName.getText(), address.getText(), postalCode.getText());
        status.setText(success ? "Player data has been added" : "failed to add player data");
    }
    @FXML
    private void assignGame() {
        Game selectedGame = gameComboBox.getValue();
        int playerId = playerData.getPlayerIdByName(firstName.getText(), lastName.getText());
        if (selectedGame == null || playerId == 0) {
            status.setText("please input player and select a game");
            return;
        }
        try {
            Date startDate = Date.valueOf(date.getValue());
            int scoretxt = Integer.parseInt(score.getText());
            boolean success = playerAndGameData.assignGameToPlayer(playerId, selectedGame.getGameId(), startDate, scoretxt);
            status.setText(success ? "game and info has been assigned to player" : "failed to assign player to game");
        }catch (Exception e){
            status.setText("invalid date and or score");
            e.printStackTrace();
        }
    }
}