import java.util.Objects;

public class Location {
    ;
    private StringBuilder Name;
    private Object type;
    private Coordonates coord;

    public void setName(StringBuilder Name1) {
        Name = Name1;
    }

    public void setType(Object object) {
        type=object;
    }

    public void setCoord(Coordonates coord1) {
        coord = coord1;
    }

    public StringBuilder getName() {
        return Name;
    }

    public Object getType() {
        return type;
    }

    public Coordonates getCoord() {
        return coord;
    }

    @Override
    public String toString() {
        return "Location{" +
                "Name=" + Name +
                ", type=" + type +
                ", coord=" + "(" + coord.x + "," + coord.y + ")" +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Location(StringBuilder Name1, Object types1, Coordonates coord1) {
        setCoord(coord1);
        setType(types1);
        setName(Name1);
    }

}