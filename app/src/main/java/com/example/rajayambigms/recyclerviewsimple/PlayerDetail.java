package com.example.rajayambigms.recyclerviewsimple;

public class PlayerDetail {

    String playerName;
    int    playerAge;
    String playerOccupation;

    public void PlayerDetail()
    {}

    public PlayerDetail(String pName , int pAge,String pOccupation)
    {
        this.playerName = pName;
        this.playerAge = pAge;
        this.playerOccupation = pOccupation;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerOccupation() {
        return playerOccupation;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerOccupation(String playerOccupation) {
        this.playerOccupation = playerOccupation;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }
}
