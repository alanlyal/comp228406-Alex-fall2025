package model;
public class Game {
    private final String gameTitle;
    private final int gameId;
public Game(String gameTitle, int gameId){
    this.gameTitle = gameTitle;
    this.gameId = gameId;
}
public int getGameId(){
    return gameId;
}
public String getGameTitle(){
    return gameTitle;
    }
    @Override public String toString()
    {
        return gameTitle;
    }
}
