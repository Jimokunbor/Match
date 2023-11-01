/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package match;

/**
 *
 * @author jimok
 */
public class Player {
    
    // This class represents a Player object, which can have up to four Algomon.
    
    private String name;
    private Algomon[] algomons;

    // Constructor
    public Player(String name, Algomon[] algomons) {
        this.name = name;
        this.algomons = algomons;
    }

    // Returns the name of the Player.
    public String getName() {
        return name;
    }

    // Returns the Algomon of the Player.
    public Algomon[] getAlgomon() {
        return algomons;
    }
}

