
public class Location {

    public enum locationTypes {
        City, Airport, GasStation
    }

    ;
    private StringBuilder Name;
    private locationTypes type;
    private Coordonates coord;

    public void setName(StringBuilder Name1) {
        Name = Name1;
    }

    public void setType(locationTypes type1) {
        type = type1;
    }

    public void setCoord(Coordonates coord1) {
        coord = coord1;
    }

    public StringBuilder getName() {
        return Name;
    }

    public locationTypes getType() {
        return type;
    }

    public Coordonates getCoord() {
        return coord;
    }

   /* public String toString()
    {
        String myString = new String("");
        myString+=Name;
        myString+="\n";
        myString+=coord.x;
        myString+="\n";
        myString+=coord.y;
        myString+="\n";
        myString+=type;
        myString+="\n";
        return myString;
    }

    */

    @Override
    public String toString() {
        return "Location{" +
                "Name=" + Name +
                ", type=" + type +
                ", coord=" + "(" + coord.x + "," + coord.y + ")" +
                '}';
    }

    public Location(StringBuilder Name1, locationTypes types1, Coordonates coord1) {
        setCoord(coord1);
        setType(types1);
        setName(Name1);
    }

}