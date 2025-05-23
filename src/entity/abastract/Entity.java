package entity.abastract;

import ground.Coordinates;
// Самый основной абстрактный класс для всех объектов/существ.
public abstract class Entity {
    public Coordinates coordinates;
    public boolean edible;

    public Entity(Coordinates coordinates, boolean edible) {
        this.coordinates = coordinates;
        this.edible = edible;
    }
}
