package entity.object;

import entity.abastract.Entity;
import ground.Coordinates;
// Дерево, нельзя кушать.
public class Tree extends Entity {
    public Tree(Coordinates coordinates, boolean edible) {
        super(coordinates, edible);
    }
}
