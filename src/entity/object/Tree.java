package entity.object;

import entity.abastract.Entity;
import ground.Coordinates;
// Дерево, нельзя кушать.
public class Tree extends Entity {
    @Override
    public String toString() {
        return "\uD83C\uDF33";
    }

    public Tree(Coordinates coordinates, boolean edible) {
        super(coordinates, edible);
    }
}
