/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package match;

/**
 *
 * @author jimok
 */
public class Ability {
    
    // This class represents an Ability object, which has a type and a name.
    private AbilityType type;
    private String name;

    // Constructor
    public Ability(AbilityType type, String name) {
        this.type = type;
        this.name = name;
    }

    // Returns the type of the Ability.
    public AbilityType getType() {
        return type;
    }

    // Returns the name of the Ability.
    public String getName() {
        return name;
    }
    
}
