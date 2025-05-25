package entity.object;

import entity.abstracted.Entity;
import ground.Coordinates;
// Камень, нельзя кушать.
public class Rock extends Entity {
    @Override
    public String toString() {
        return "\uD83D\uDDFF";
    }

    public Rock(Coordinates coordinates, boolean edible) {
        super(coordinates, edible);
    }
}
