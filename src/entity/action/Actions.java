package entity.action;

import entity.abstracted.Creature;
import entity.abstracted.Entity;
import ground.Coordinates;
import ground.Field;
import ground.FieldConsoleRender;

import java.util.Scanner;

public class Actions {
    Field field = new Field();
    Scanner scanner = new Scanner(System.in); // Тест в makeMove будем передавать в функцию подумать над этим!!
    Coordinates coordinates;
    public void initActions() {
        field.setUpRandomCreaturePosition();
        FieldConsoleRender fieldConsoleRender = new FieldConsoleRender();
        fieldConsoleRender.render(field);
        makeMove();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        fieldConsoleRender.render(field);
    }


    public boolean makeMove() {
        int startCoordinatesX, startCoordinatesY;
        int finishCoordinatesX, finishCoordinatesY;
        Entity animal;
        startCoordinatesX = scanner.nextInt();
        startCoordinatesY = scanner.nextInt();
        Coordinates startCoordinates = new Coordinates(startCoordinatesX, startCoordinatesY);
        if(field.isSquareOccupied(startCoordinates) && field.getEntity(startCoordinates) instanceof Creature){
            finishCoordinatesX = scanner.nextInt();
            finishCoordinatesY = scanner.nextInt();
            Coordinates finishCoordinates = new Coordinates(finishCoordinatesX, finishCoordinatesY);
            animal = field.getEntity(startCoordinates);
            if(finishCoordinatesX <= field.getSIZE_X() - 1 && finishCoordinatesY <= field.getSIZE_Y() - 1 && finishCoordinatesX >= 0 && finishCoordinatesY >= 0 && !field.isSquareOccupied(finishCoordinates)){
                field.setCreature(finishCoordinates, animal);
                field.fieldClear(startCoordinates);
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
        return true;
    }
}
