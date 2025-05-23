package ground;

import entity.abastract.Entity;
import entity.animals.Herbivore;

import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
// Само поле с раставлением животных и ТП.
public class Field {
    final int MAX_HERBIVORE = 20;
    final int MAX_PREDATOR = 2;
    final int MAX_GRASS = 20;
    final int MAX_ROCK = 5;
    final int MAX_TREE = 10;
    final int SIZE_X = 15;
    final int SIZE_Y = 15;
    final Random rand = new Random();

    HashMap<Coordinates, Entity> fields = new HashMap<>();

    public void setCreature(Coordinates coordinates, Entity entity) {
        entity.coordinates = coordinates;
        fields.put(coordinates, entity);
    }
    public void setUpRandomCreaturePosition() {
        Set<Coordinates> occupiedPositions = new HashSet<>();
        while (occupiedPositions.size() < MAX_HERBIVORE) {
            int positionX = rand.nextInt(SIZE_X);
            int positionY = rand.nextInt(SIZE_Y);
            Coordinates coordinates = new Coordinates(positionX, positionY);
            if(occupiedPositions.contains(coordinates)) {
                continue;
            }
            occupiedPositions.add(coordinates);
            setCreature(coordinates, new Herbivore(coordinates, true));
        }
    }
}
