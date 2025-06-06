package entity.animals;

import entity.abstracted.Creature;
import ground.Coordinates;
// Травоядный
public class Herbivore extends Creature {
    @Override
    public String toString() {
        return "\uD83D\uDC30";
    }

    public Herbivore(Coordinates coordinates, boolean edible) {
        super(coordinates, edible);
        setSpeed(5);
        setHealth(5);
    }
}
