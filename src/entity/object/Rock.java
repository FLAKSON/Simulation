package entity.object;

import entity.abastract.Entity;
import ground.Coordinates;
// Камень, нельзя кушать.
public class Rock extends Entity {
    public Rock(Coordinates coordinates, boolean edible) {
        super(coordinates, edible);
    }
}
