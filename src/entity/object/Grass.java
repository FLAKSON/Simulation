package entity.object;

import entity.abastract.Entity;
import ground.Coordinates;
// Трава, можно кушать
public class Grass extends Entity {
    public Grass(Coordinates coordinates, boolean edible) {
        super(coordinates, edible);
    }
}
