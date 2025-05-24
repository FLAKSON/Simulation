package entity.object;

import entity.abastract.Entity;
import ground.Coordinates;
// Трава, можно кушать
public class Grass extends Entity {
    @Override
    public String toString() {
        return "\uD83C\uDF3F";
    }

    public Grass(Coordinates coordinates, boolean edible) {
        super(coordinates, edible);
    }
}
