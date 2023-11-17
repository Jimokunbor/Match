/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package match;

/**
 *
 * @author jimok
 */
public class Main {
    
     // Create two Players.
        Player player1 = new Player("Ash", new Algomon[]{
                new Algomon("Charizard", 100, 100, 50, 100, new Ability[]{
                        new Ability(AbilityType.OFFENSIVE, "Ember"),
                        new Ability(AbilityType.DEFENSIVE, "Protect"),
                        new Ability(AbilityType.HEALING, "Potion")
                }),
                new Algomon("Pikachu", 80, 80, 60, 90, new Ability[]{
                        new Ability(AbilityType.OFFENSIVE, "Thunderbolt"),
                        new Ability(AbilityType.DEFENSIVE, "Quick Attack"),
                        new Ability(AbilityType.HEALING, "Thunder Wave")
                })
        });

        Player player2 = new Player("Misty", new Algomon[]{
                new Algomon("Starmie", 100, 70, 80, 115, new Ability[]{
                        new Ability(AbilityType.OFFENSIVE, "Hydro Pump"),
                        new Ability(AbilityType.DEFENSIVE, "Barrier"),
                        new Ability(AbilityType.HEALING, "Recover")
                }),
                        

