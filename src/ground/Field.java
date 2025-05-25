package ground;

import entity.abstracted.Entity;
import entity.animals.Herbivore;
import entity.animals.Predator;
import entity.object.Grass;
import entity.object.Rock;
import entity.object.Tree;

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
    final int SIZE_X = 20;
    final int SIZE_Y = 40;
    final Random random = new Random();

    HashMap<Coordinates, Entity> fields = new HashMap<>();


    public void setCreature(Coordinates coordinates, Entity entity) {
        entity.coordinates = coordinates;
        fields.put(coordinates, entity);
    }
    public void setUpRandomCreaturePosition() {
        int totalNumberOfEntities = 0;
        Set<Coordinates> occupiedPositions = new HashSet<>();
        while (occupiedPositions.size() < MAX_HERBIVORE + totalNumberOfEntities) {
            int positionX = random.nextInt(SIZE_X);
            int positionY = random.nextInt(SIZE_Y);
            Coordinates coordinates = new Coordinates(positionX, positionY);
            if(occupiedPositions.contains(coordinates)) {
                continue;
            }
            occupiedPositions.add(coordinates);
            setCreature(coordinates, new Herbivore(coordinates, true));
        }
        totalNumberOfEntities += MAX_HERBIVORE;

        while (occupiedPositions.size() < MAX_PREDATOR + totalNumberOfEntities) {
            int positionX = random.nextInt(SIZE_X);
            int positionY = random.nextInt(SIZE_Y);
            Coordinates coordinates = new Coordinates(positionX, positionY);
            if(occupiedPositions.contains(coordinates)) {
                continue;
            }
            occupiedPositions.add(coordinates);
            setCreature(coordinates, new Predator(coordinates, true));
        }
        totalNumberOfEntities += MAX_PREDATOR;

        while (occupiedPositions.size() < MAX_GRASS + totalNumberOfEntities) {
            int positionX = random.nextInt(SIZE_X);
            int positionY = random.nextInt(SIZE_Y);
            Coordinates coordinates = new Coordinates(positionX, positionY);
            if(occupiedPositions.contains(coordinates)) {
                continue;
            }
            occupiedPositions.add(coordinates);
            setCreature(coordinates, new Grass(coordinates, true));
        }
        totalNumberOfEntities += MAX_GRASS;

        while (occupiedPositions.size() < MAX_ROCK + totalNumberOfEntities) {
            int positionX = random.nextInt(SIZE_X);
            int positionY = random.nextInt(SIZE_Y);
            Coordinates coordinates = new Coordinates(positionX, positionY);
            if(occupiedPositions.contains(coordinates)) {
                continue;
            }
            occupiedPositions.add(coordinates);
            setCreature(coordinates, new Rock(coordinates, false));
        }
        totalNumberOfEntities += MAX_ROCK;

        while (occupiedPositions.size() < MAX_TREE + totalNumberOfEntities) {
            int positionX = random.nextInt(SIZE_X);
            int positionY = random.nextInt(SIZE_Y);
            Coordinates coordinates = new Coordinates(positionX, positionY);
            if(occupiedPositions.contains(coordinates)) {
                continue;
            }
            occupiedPositions.add(coordinates);
            setCreature(coordinates, new Tree(coordinates, false));
        }
    }
    public boolean isSquareOccupied(Coordinates coordinates) {
        return fields.containsKey(coordinates);
    }
    public Entity getEntity(Coordinates coordinates) {
        return fields.get(coordinates);
    }
}
