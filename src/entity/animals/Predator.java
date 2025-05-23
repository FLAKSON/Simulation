package entity.animals;

import entity.abastract.Creature;
import ground.Coordinates;
// Хищник
public class Predator extends Creature {
    public Predator(Coordinates coordinates, boolean edible) {
        super(coordinates, edible);
    }
}
