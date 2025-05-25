package entity.action;

import ground.Field;
import ground.FieldConsoleRender;

public class Actions {
    Field field = new Field();

    public void initActions() {
        field.setUpRandomCreaturePosition();
        FieldConsoleRender fieldConsoleRender = new FieldConsoleRender();
        fieldConsoleRender.render(field);
    }
}
