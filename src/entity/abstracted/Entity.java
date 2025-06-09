package entity.abstracted;

import ground.Coordinates;
// Самый основной абстрактный класс для всех объектов/существ.
public abstract class Entity {
    public Coordinates coordinates;
    public boolean edible;
    public Entity(Coordinates coordinates, boolean edible) {
        this.coordinates = coordinates;
        this.edible = edible;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public boolean isEdible() {
        return edible;
    }
}
