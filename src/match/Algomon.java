/*
 * https://github.com/Jimokunbor/OOP-Lab
Luiz Gustavo Almeida Silva 
2022553
 * Okunobr James Ehigiamusoe
2022473
 */
package match;

/**
 *
 * @author jimok
 */
public class Algomon {
      private String name;
    private int health;
    private int attack;
    private int defence;
    private int speed;
    private Ability[] abilities;

    // Constructor
    public Algomon(String name, int health, int attack, int defence, int speed, Ability[] abilities) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.abilities = abilities;
    }

    // Returns the name of the Algomon.
    public String getName() {
        return name;
    }

    // Returns the health of the Algomon.
    public int getHealth() {
        return health;
    }

    // Returns the attack of the Algomon.
    public int getAttack() {
        return attack;
    }

    // Returns the defence of the Algomon.
    public int getDefence() {
        return defence;
    }

    // Returns the speed of the Algomon.
    public int getSpeed() {
        return speed;
    }

    // Returns the Abilities of the Algomon.
    public Ability[] getAbilities() {
        return abilities;
    }
}
