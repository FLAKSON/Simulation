package entity.animals;

import entity.abastract.Creature;
import ground.Coordinates;
// Травоядный
public class Herbivore extends Creature {

    @Override
    public String toString() {
        return "H";
    }

    public Herbivore(Coordinates coordinates, boolean edible) {
        super(coordinates, edible);
    }
}
