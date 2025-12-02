package model;
public class Player {
private final int playerId;
private final String firstName;
private final String lastName;
private final String address;
private final String postalCode;
public Player(int playerId, String firstName, String lastName, String address, String postalCode){
    this.playerId = playerId;
    this.firstName=firstName;
    this.lastName=lastName;
    this.address=address;
    this.postalCode=postalCode;
}
public int getPlayerId(){
    return playerId;
}
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public String getPostalCode(){
        return postalCode;
    }
    @Override public String toString(){
    return firstName+ " " + lastName;
    }
}