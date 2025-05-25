package ground;

import entity.abstracted.Entity;

// Рендеринг поля.
public class FieldConsoleRender {
    public static String EMPTY_FIELD_SPRITE = "\uD83D\uDFE9";

    public void render(Field field) {
        for (int x = 0; x < field.SIZE_X; x++) {
            String line = "";
            for (int y = 0; y < field.SIZE_Y; y++) {
                Coordinates coordinates = new Coordinates(x, y);
                if (!field.isSquareOccupied(coordinates)) {
                    line += getSpriteForField();
                }
                else {
                    line += getEntitySprite(coordinates , field);
                }
            }
            System.out.println(line);
        }
    }

    public String getSpriteForField() {
        return EMPTY_FIELD_SPRITE;
    }
    public String getEntitySprite(Coordinates coordinates , Field field) {
        Entity entity = field.getEntity(coordinates);
        return entity.toString();
    }
}
