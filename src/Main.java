import ground.Field;
import ground.FieldConsoleRender;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        field.setUpRandomCreaturePosition();
        FieldConsoleRender fieldConsoleRender = new FieldConsoleRender();
        fieldConsoleRender.render(field);
        int asdas = 1;
    }
}
