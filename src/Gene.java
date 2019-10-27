import java.util.Objects;

import static java.lang.Math.*;

/*
 Gene is an invidual formed by set of varibles

 */
public class Gene {
    private final int x;
    private final int y;

    public Gene(final int x,final int y){
        this.x = x;
        this.y = y;
    }

    double distance(final Gene other){
        return sqrt(pow(getX()- other.getX(),2) + pow(getY() - other.getY(),2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gene gene = (Gene) o;
        return x == gene.x &&
                y == gene.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Gene{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
