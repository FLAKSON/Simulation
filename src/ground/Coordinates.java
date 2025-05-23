package ground;
// Координаты на поле.
public class Coordinates {
    public final int X;
    public final int Y;
    public Coordinates(int x, int y) {
        X = x;
        Y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates that = (Coordinates) o;
        return X == that.X && Y == that.Y;
    }

    @Override
    public int hashCode() {
        int result = X;
        result = 31 * result + Y;
        return result;
    }
}
