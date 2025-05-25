package entity.animals;

import entity.abstracted.Creature;
import ground.Coordinates;
// Хищник
public class Predator extends Creature {
    @Override
    public String toString() {
        return "\uD83D\uDC3A";
    }

    public Predator(Coordinates coordinates, boolean edible) {
        super(coordinates, edible);
        setSpeed(8);
        setHealth(10);
    }
}
