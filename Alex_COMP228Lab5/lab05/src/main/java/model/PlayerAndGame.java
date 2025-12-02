package model;
public class PlayerAndGame {
private final int gameId;
private final int playerId;
public PlayerAndGame(int gameId, int playerId)
{
    this.gameId= gameId;
    this.playerId=playerId;
}
public int getGameId()
{
    return gameId;
}
public int getPlayerId()
{
    return playerId;
}
@Override public String toString()
{
    return "PlayerAndGame{" + "playerId="+playerId+ " gameId=" + gameId+"}";
}
}
