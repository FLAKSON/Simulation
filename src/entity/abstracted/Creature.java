package entity.abstracted;

import ground.Coordinates;
// Абстрактный класс для именно живых существ.
public abstract class Creature extends Entity {
    private int speed;
    private int health;

    public Creature(Coordinates coordinates, boolean edible) {
        super(coordinates, edible);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public void makeMove() {

    }
}
